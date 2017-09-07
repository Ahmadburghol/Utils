package com.progressoft.utils.spelling.english;

import com.progressoft.utils.spelling.Constants;
import com.progressoft.utils.spelling.NumbersSpeller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class NumbersToEnglishWords implements NumbersSpeller {

    public static final int INTEGER_PART = 0;
    private static final String ZERO = "0";
    private static final String MINUS = "minus";
    private static final String TOO_LARGE_NUMBER = "too large number";
    private static final int FRACTION_PART = 1;
    private static final int LESS_THAN = -1;

    private static final String[] DECIMAL_FAMILIES = {
            "tenth",
            "hundredth",
            "thousandth",
            "ten-thousandth",
            "hundred-thousandth",
            "millionth",
            "ten-millionth",
            "hundred-millionth" // TODO
//            "billionth",
//            "ten-billionth",
//            "hundred-billionth",
//            "trillionth",
//            "ten-trillionth",
//            "hundred-trillionth",
//            "quadrillionth",
//            "ten-quadrillionth",
//            "hundred-quadrillionth",
//            "quintillionth",
//            "ten-quintillionth",
//            "hundred-quintillionth"
    };
    private static final String AND = SPACE + "and" + SPACE;

    private final List<UpperBoundHandler> upperBoundHandlers = new AbstractEnglishFamiliesToSpellInitializer(
            Arrays.asList("thousand", "million", "billion", "trillion", "quadrillion", "quintillion")
    ) {
        @Override
        protected String spellPositionalNumber(BigInteger number, BigInteger position, String family) {
            return NumbersToEnglishWords.this.spellPositionalNumber(number, position, family);
        }
    }.initializedList();

    @Override
    public String spell(BigDecimal number) {
        if (number.toPlainString().contains(".")) {
            String[] numberSections = number.toPlainString().split("\\.");
            BigInteger integerPart = new BigInteger(numberSections[INTEGER_PART]);
            BigInteger fractionPart = new BigInteger(numberSections[FRACTION_PART]);
            if (!numberSections[INTEGER_PART].equals(ZERO) && !ZERO.equals(fractionPart.toString()))
                return spell(integerPart) + AND + spellFractionPart(formatFraction(numberSections[FRACTION_PART]));
            if (ZERO.equals(fractionPart.toString()))
                return spell(integerPart);
            return spellFractionPart(formatFraction(numberSections[FRACTION_PART]));
        }
        return spell(new BigInteger(number.toString()));
    }

    private String spellFractionPart(String fraction) {
        BigInteger number = new BigInteger(fraction);
        return spell(number) + SPACE
                + DECIMAL_FAMILIES[fraction.length() - 1]
                + ("1".equals(number.toString()) ? "" : "s");
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

    private String formatFraction(String fraction) {
        Stack<Character> stack = new Stack<>();
        for (char digit : fraction.toCharArray())
            stack.push(digit);
        while (!stack.isEmpty() && stack.peek() == '0')
            stack.pop();
        String value = "";
        while (!stack.isEmpty())
            value += stack.pop();
        return new StringBuilder(value).reverse().toString();
    }

}
