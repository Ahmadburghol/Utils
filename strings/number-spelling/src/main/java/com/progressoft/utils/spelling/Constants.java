package com.progressoft.utils.spelling;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Constants {
    public final static Map<BigInteger, String> SPELLED_NUMBER = new HashMap<BigInteger, String>() {
        {
            put(BigInteger.valueOf(0L), "zero");
            put(BigInteger.valueOf(1L), "one");
            put(BigInteger.valueOf(2L), "two");
            put(BigInteger.valueOf(3L), "three");
            put(BigInteger.valueOf(4L), "four");
            put(BigInteger.valueOf(5L), "five");
            put(BigInteger.valueOf(6L), "six");
            put(BigInteger.valueOf(7L), "seven");
            put(BigInteger.valueOf(8L), "eight");
            put(BigInteger.valueOf(9L), "nine");
            put(BigInteger.valueOf(10L), "ten");
            put(BigInteger.valueOf(11L), "eleven");
            put(BigInteger.valueOf(12L), "twelve");
            put(BigInteger.valueOf(13L), "thirteen");
            put(BigInteger.valueOf(14L), "fourteen");
            put(BigInteger.valueOf(15L), "fifteen");
            put(BigInteger.valueOf(16L), "sixteen");
            put(BigInteger.valueOf(17L), "seventeen");
            put(BigInteger.valueOf(18L), "eighteen");
            put(BigInteger.valueOf(19L), "nineteen");
            put(BigInteger.valueOf(20L), "twenty");
            put(BigInteger.valueOf(30L), "thirty");
            put(BigInteger.valueOf(40L), "forty");
            put(BigInteger.valueOf(50L), "fifty");
            put(BigInteger.valueOf(60L), "sixty");
            put(BigInteger.valueOf(70L), "seventy");
            put(BigInteger.valueOf(80L), "eighty");
            put(BigInteger.valueOf(90L), "ninety");
        }
    };
    public static final int INTEGER_PART = 0;
    public static final String ZERO = "0";
    public static final String MINUS = "minus";
    public static final String TOO_LARGE_NUMBER = "too large number";
    public static final int FRACTION_PART = 1;
    public static final int LESS_THAN = -1;
    public static final String SPACE = " ";
    public static final String AND = SPACE + "and" + SPACE;
    public static final String NOTHING = "";
    public static final String PLURAL = "s";
    public static final String DOT = ".";
    public static final char ZERO_DIGIT = '0';
    public static final String ONE = "1";
}
