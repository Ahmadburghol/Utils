package com.progressoft.utils.spelling;

import java.util.HashMap;
import java.util.Map;

public class NumberToWords {

    //TODO: trillion, quadrillion, quintillion

    private final static Map<Long, String> spelledNumber = new HashMap<Long, String>() {
        {
            put(0L, "zero");
            put(1L, "one");
            put(2L, "two");
            put(3L, "three");
            put(4L, "four");
            put(5L, "five");
            put(6L, "six");
            put(7L, "seven");
            put(8L, "eight");
            put(9L, "nine");
            put(10L, "ten");
            put(11L, "eleven");
            put(12L, "twelve");
            put(13L, "thirteen");
            put(14L, "fourteen");
            put(15L, "fifteen");
            put(16L, "sixteen");
            put(17L, "seventeen");
            put(18L, "eighteen");
            put(19L, "nineteen");
            put(20L, "twenty");
            put(30L, "thirty");
            put(40L, "forty");
            put(50L, "fifty");
            put(60L, "sixty");
            put(70L, "seventy");
            put(80L, "eighty");
            put(90L, "ninety");
        }
    };
    public static final String SPACE = " ";

    public String spell(long number) {
        if (spelledNumber.containsKey(number))
            return spelledNumber.get(number);
        if (number < 100)
            return spelledNumber.get(number / 10 * 10) + "-" + spelledNumber.get(number % 10);
        if (number < 1_000)
            return spellPositionalNumber(number, 100, "hundred");
        if (number < 1_000_000)
            return spellPositionalNumber(number, 1_000, "thousand");
        if (number < 1_000_000_000)
            return spellPositionalNumber(number, 1_000_000, "million");
        return spellPositionalNumber(number, 1_000_000_000, "billion");
    }

    private String spellPositionalNumber(long number, int position, String spelledPosition) {
        String value = spell(number / position) + SPACE + spelledPosition;
        if (number % position != 0)
            return value + SPACE + spell(number % position);
        return value;
    }

}
