package com.progressoft.utils.spelling.english;

import com.progressoft.utils.spelling.Constants;
import com.progressoft.utils.spelling.CurrencyProvider;
import com.progressoft.utils.spelling.NumbersSpeller;
import com.progressoft.utils.strings.StringUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.*;
import static com.progressoft.utils.spelling.Constants.*;
import static java.util.Objects.nonNull;

public class NumbersToEnglishWords implements NumbersSpeller {

    private static final String[] DECIMAL_FAMILIES = {
            "tenth",
            "hundredth",
            "thousandth",
            "ten-thousandth",
            "hundred-thousandth",
            "millionth",
            "ten-millionth",
            "hundred-millionth"
    };

    private final List<UpperBoundHandler> upperBoundHandlers = new AbstractEnglishFamiliesToSpellInitializer(
            Arrays.asList("thousand", "million", "billion", "trillion", "quadrillion", "quintillion")
    ) {
        @Override
        protected String spellPositionalNumber(BigInteger number, BigInteger position, String family) {
            return NumbersToEnglishWords.this.spellPositionalNumber(number, position, family);
        }
    }.initializedList();

    private CurrencyProvider currencyProvider;

    public NumbersSpeller withCurrencyProvider(CurrencyProvider currencyProvider) {
        this.currencyProvider = currencyProvider;
        return this;
    }

    @Override
    public String spell(BigDecimal number) {
        if (number.toPlainString().contains(DOT))
            return spellDecimalNumber(number);
        return spell(new BigInteger(number.toString())) + spellIntegerCurrency(number.toString());
    }

    private BigInteger positiveValue(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) == LESS_THAN)
            return number.multiply(BigInteger.valueOf(-1));
        return number;
    }

    private String spell(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) == LESS_THAN)
            return MINUS + SPACE + spell(positiveValue(number));
        if (Constants.SPELLED_NUMBER.containsKey(number))
            return Constants.SPELLED_NUMBER.get(number);
        for (UpperBoundHandler upperBoundHandler : upperBoundHandlers)
            if (number.compareTo(upperBoundHandler.upperBound) == LESS_THAN)
                return upperBoundHandler.handler.handle(number);
        return TOO_LARGE_NUMBER;
    }

    private String spellPositionalNumber(BigInteger number, BigInteger position, String spelledPosition) {
        String value = spell(number.divide(position)) + SPACE + spelledPosition;
        if (number.mod(position).compareTo(BigInteger.ZERO) != 0)
            return value + SPACE + spell(number.mod(position));
        return value;
    }

    private String spellDecimalNumber(BigDecimal number) {
        String[] numberSections = number.toPlainString().split("\\.");
        BigInteger integerPart = new BigInteger(numberSections[INTEGER_PART]);
        BigInteger fractionPart = new BigInteger(numberSections[FRACTION_PART]);
        if (!numberSections[INTEGER_PART].equals(ZERO) && !ZERO.equals(fractionPart.toString()))
            return spellIntegerPart(integerPart) + AND + spellFractionPart(removeRightMostZeros(numberSections[FRACTION_PART]));
        if (ZERO.equals(fractionPart.toString()))
            return spellIntegerPart(integerPart);
        return spellFractionPart(removeRightMostZeros(numberSections[FRACTION_PART]));
    }

    private String spellIntegerPart(BigInteger integerPart) {
        return spell(integerPart) + spellIntegerCurrency(integerPart.toString());
    }

    private String spellIntegerCurrency(String number) {
        if (nonNull(currencyProvider))
            return SPACE + currencyProvider.integerPart(number.toString());
        return NOTHING;
    }

    private String spellFractionPart(String fraction) {
        BigInteger number = new BigInteger(fraction);
        if (isNull(currencyProvider))
            return spell(number) + SPACE
                    + DECIMAL_FAMILIES[fraction.length() - 1]
                    + (ONE.equals(number.toString()) ? NOTHING : PLURAL);
        return spellFractionWithCurrency(formatFractionForCurrency(fraction));
    }

    private String formatFractionForCurrency(String fraction) {
        return StringUtils.padRightBy(fraction, ZERO_DIGIT, currencyProvider.fractionsLength());
    }

    private String spellFractionWithCurrency(String fraction) {
        if (fraction.length() > currencyProvider.fractionsLength())
            throw new InvalidFractionsForProvidedCurrencyException();
        BigInteger number = new BigInteger(fraction);
        return spell(number) + SPACE + currencyProvider.fractionPart(number.toString());
    }

    private String removeRightMostZeros(String fraction) {
        return StringUtils.removeRightMostCharacters(fraction, ZERO_DIGIT);
    }
}
