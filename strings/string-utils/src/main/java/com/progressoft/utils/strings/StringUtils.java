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
        while(string.length()<targetLength)
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

    public static class InvalidStringException extends RuntimeException {
    }

    public static class InvalidStringValueException extends RuntimeException {
    }
}
