package com.progressoft.utils.spelling.english;

import com.progressoft.utils.spelling.Constants;
import com.progressoft.utils.spelling.NumbersSpeller;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class NumbersToEnglishWords implements NumbersSpeller {

    public static final String MINUS = "minus";
    public static final String TOO_LARGE_NUMBER = "too large number";
    public static final int LESS_THAN = -1;

    private final List<UpperBoundHandler> upperBoundHandlers = new AbstractEnglishFamiliesToSpellInitializer(
            Arrays.asList("thousand", "million", "billion", "trillion", "quadrillion", "quintillion")
    ) {
        @Override
        protected String spellPositionalNumber(BigInteger number, BigInteger position, String family) {
            return NumbersToEnglishWords.this.spellPositionalNumber(number, position, family);
        }
    }.initializedList();

    @Override
    public String spell(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) == LESS_THAN)
            return MINUS + SPACE + spell(positiveValue(number));
        if (Constants.SPELLED_NUMBER.containsKey(number))
            return Constants.SPELLED_NUMBER.get(number);
        for (UpperBoundHandler upperBoundHandler : upperBoundHandlers)
            if (number.compareTo(upperBoundHandler.upperBound) == LESS_THAN)
                return upperBoundHandler.handler.handle(number);
        return TOO_LARGE_NUMBER;
    }

    private BigInteger positiveValue(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) == LESS_THAN)
            return number.multiply(BigInteger.valueOf(-1));
        return number;
    }

    private String spellPositionalNumber(BigInteger number, BigInteger position, String spelledPosition) {
        String value = spell(number.divide(position)) + SPACE + spelledPosition;
        if (number.mod(position).compareTo(BigInteger.ZERO) != 0)
            return value + SPACE + spell(number.mod(position));
        return value;
    }

}
