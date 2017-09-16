package com.progressoft.utils.strings;

import java.math.BigDecimal;
import java.util.Stack;

import static java.util.Objects.*;

public class StringUtils {

    private static final int INDEX_NOT_FOUND = -1;

    private StringUtils() {
    }

    public static String reverse(String string) {
        if (isNull(string))
            throw new InvalidStringException();
        return new StringBuffer(string).reverse().toString();
    }

    public static boolean isNumber(String string) {
        if (isNull(string) || string.isEmpty())
            throw new InvalidStringException();
        try {
            new BigDecimal(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isAlphabet(String string) {
        if (isNull(string) || string.isEmpty())
            throw new InvalidStringException();
        for (char character : string.toLowerCase().toCharArray())
            if (!(character >= 'a' && character <= 'z'))
                return false;
        return true;
    }

    public static int frequencyOfValue(String string, String value) {
        if (isNull(string))
            throw new InvalidStringException();
        if (isNull(value) || value.isEmpty())
            throw new InvalidStringValueException();
        int searchFromIndex = 0, lastFoundedValueAt = 0;
        int frequencyOfValue = 0;
        while ((lastFoundedValueAt = string.indexOf(value, searchFromIndex)) != INDEX_NOT_FOUND) {
            ++frequencyOfValue;
            searchFromIndex = lastFoundedValueAt + 1;
        }
        return frequencyOfValue;
    }

    public static String padRightBy(String string, char toAppend, int targetLength) {
        if (isNull(string))
            throw new InvalidStringException();
        while (string.length() < targetLength)
            string += toAppend;
        return string;
    }

    public static String removeRightMostCharacters(String string, char toRemove) {
        if (isNull(string))
            throw new InvalidStringException();
        Stack<Character> stack = new Stack<>();
        for (char digit : string.toCharArray())
            stack.push(digit);
        while (!stack.isEmpty() && stack.peek() == toRemove)
            stack.pop();
        String value = "";
        while (!stack.isEmpty())
            value += stack.pop();
        return new StringBuilder(value).reverse().toString();
    }

    private static int[][] lcsMemoization;
    private static String firstString;
    private static String secondString;

    public static String longestCommonSubsequence(String firstString, String secondString) {
        if (isNull(firstString) || isNull(secondString))
            throw new InvalidStringException();
        lcsMemoization = new int[firstString.length()][secondString.length()];
        for (int i = 0; i < firstString.length(); ++i)
            for (int j = 0; j < secondString.length(); ++j)
                lcsMemoization[i][j] = -1;
        StringUtils.firstString = firstString;
        StringUtils.secondString = secondString;
        return lcsValue(0, 0);
    }

    private static int lcsLength(int f, int s) {
        if (f >= firstString.length() || s >= secondString.length())
            return 0;
        if (lcsMemoization[f][s] != -1)
            return lcsMemoization[f][s];
        if (firstString.charAt(f) == secondString.charAt(s))
            return lcsMemoization[f][s] = lcsLength(f + 1, s + 1) + 1;
        return lcsMemoization[f][s] = Math.max(lcsLength(f + 1, s), lcsLength(f, s + 1));
    }

    private static String lcsValue(int f, int s) {
        if (f >= firstString.length() || s >= secondString.length())
            return "";
        int best = lcsLength(f, s);
        if (best == lcsLength(f + 1, s + 1) + 1)
            return firstString.charAt(f) + lcsValue(f + 1, s + 1);
        if (best == lcsLength(f + 1, s))
            return lcsValue(f + 1, s);
        return lcsValue(f, s + 1);
    }

    private static int [] failureStep(String pattern) {
        int [] failureStep = new int[pattern.length()];
        failureStep[0] = 0;
        for(int i=1,k=0;i<pattern.length();++i) {
            while(k>0 && pattern.charAt(k) != pattern.charAt(i))
                k = failureStep[k-1];
            if(pattern.charAt(k) == pattern.charAt(i))
                failureStep[i] = ++k;
            else
                failureStep[i] = k;
        }
        return failureStep;
    }

    public static boolean fastContains(String string, String pattern) {
        if (isNull(string) || isNull(pattern))
            throw new InvalidStringException();
        if (pattern.isEmpty())
            return false;
        return kmpAlgorithm(string, pattern);
    }

    private static boolean kmpAlgorithm(String string, String pattern) {
        int [] failureStep = failureStep(pattern);
        for(int i=0,k=0;i<string.length();++i) {
            while(k>0 && pattern.charAt(k) != string.charAt(i))
                k = failureStep[k-1];
            if(pattern.charAt(k) == string.charAt(i))
                ++k;
            if(k == pattern.length())
                return true;
        }
        return false;
    }

    public static class InvalidStringException extends RuntimeException {
    }

    public static class InvalidStringValueException extends RuntimeException {
    }

}
