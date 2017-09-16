package com.progressoft.utils.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingReverseStringWithNullString_thenShouldThrowException() {
        StringUtils.reverse(null);
    }

    @Test
    public void usingStringUtils_whenCallingReverseStringWithValidString_thenShouldReturnReversedString() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingIsNumberWithNullString_thenShouldThrowException() {
        StringUtils.isNumber(null);
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingIsNumberWithEmptyString_thenShouldThrowException() {
        StringUtils.isNumber("");
    }

    @Test
    public void usingStringUtils_whenCallingIsNumberWithNumberString_thenShouldReturnTrue() {
        assertTrue(StringUtils.isNumber("123"));
    }

    @Test
    public void usingStringUtils_whenCallingIsNumberWithDecimalNumberString_thenShouldReturnTrue() {
        assertTrue(StringUtils.isNumber("123.0"));
    }

    @Test
    public void usingStringUtils_whenCallingIsNumberWithDecimalNumberString_2_thenShouldReturnTrue() {
        assertTrue(StringUtils.isNumber(".123"));
    }

    @Test
    public void usingStringUtils_whenCallingIsNumberWithDecimalNumberString_3_thenShouldReturnTrue() {
        assertTrue(StringUtils.isNumber("0.0"));
    }

    @Test
    public void usingStringUtils_whenCallingIsNumberWithNonNumberString_thenShouldReturnFalse() {
        assertFalse(StringUtils.isNumber("1.2.3"));
    }

    @Test
    public void usingStringUtils_whenCallingIsNumberWithNonNumberString_2_thenShouldReturnFalse() {
        assertFalse(StringUtils.isNumber("1a23"));
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingIsAlphabetWithNullString_thenShouldThrowException() {
        StringUtils.isAlphabet(null);
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingIsAlphabetWithEmptyString_thenShouldThrowException() {
        StringUtils.isAlphabet("");
    }

    @Test
    public void usingStringUtils_whenCallingIsAlphabetWithNumberString_thenShouldReturnFalse() {
        assertFalse(StringUtils.isAlphabet("123"));
    }

    @Test
    public void usingStringUtils_whenCallingIsAlphabetWithStringContainsDots_thenShouldReturnFalse() {
        assertFalse(StringUtils.isAlphabet("a.b.c"));
    }

    @Test
    public void usingStringUtils_whenCallingIsAlphabetWithAlpabetString_thenShouldReturnTrue() {
        assertTrue(StringUtils.isAlphabet("abc"));
    }

    @Test
    public void usingStringUtils_whenCallingIsAlphabetWithUpperCaseAlpabetString_thenShouldReturnTrue() {
        assertTrue(StringUtils.isAlphabet("ABC"));
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingFrequencyOfValueWithNullString_thenShouldThrowException() {
        StringUtils.frequencyOfValue(null, "value");
    }

    @Test(expected = StringUtils.InvalidStringValueException.class)
    public void usingStringUtils_whenCallingFrequencyOfValueWithNullValue_thenShouldThrowException() {
        StringUtils.frequencyOfValue("string", null);
    }

    @Test(expected = StringUtils.InvalidStringValueException.class)
    public void usingStringUtils_whenCallingFrequencyOfValueWithEmptyValue_thenShouldThrowException() {
        StringUtils.frequencyOfValue("string", "");
    }

    @Test
    public void usingStringUtils_whenCallingFrequencyOfValueWithValidParams_thenShouldReturnTheFrequency() {
        assertEquals(2, StringUtils.frequencyOfValue("Progressoft", "s"));
    }

    @Test
    public void usingStringUtils_whenCallingFrequencyOfValueWithValidParams_2_thenShouldReturnTheFrequency() {
        assertEquals(2, StringUtils.frequencyOfValue("Progressoft Utils test", "es"));
    }

    @Test
    public void usingStringUtils_whenCallingFrequencyOfValueWithValidParams_3_thenShouldReturnTheFrequency() {
        assertEquals(4, StringUtils.frequencyOfValue("Progressoft Utils test", "t"));
    }

    @Test
    public void usingStringUtils_whenCallingFrequencyOfValueWithNonExistingValue_thenShouldReturnZero() {
        assertEquals(0, StringUtils.frequencyOfValue("Progressoft", "x"));
    }

    @Test
    public void usingStringUtils_whenCallingPadRightByWithStringLengthLessThanTarget_thenShouldPaddedString() {
        String value = "value";
        assertEquals("valuex", StringUtils.padRightBy(value, 'x', 6));
        assertEquals("value", value);
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingPadRightByWithNullString_thenShouldThrowException() {
        StringUtils.padRightBy(null, 'x', 0);
    }

    @Test
    public void usingStringUtils_whenCallingPadRightByWithStringLengthLargestThanTarget_thenShouldPaddedString() {
        String value = "value";
        assertEquals("value", StringUtils.padRightBy(value, 'x', 1));
        assertEquals("value", value);
    }

    @Test
    public void usingStringUtils_whenCallingPadRightByWithStringLengthSameAsTarget_thenShouldPaddedString() {
        String value = "value";
        assertEquals("value", StringUtils.padRightBy(value, 'x', 5));
        assertEquals("value", value);
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingRemoveRightMostCharactersWithNullString_thenShouldThrowException() {
        StringUtils.removeRightMostCharacters(null, '0');
    }

    @Test
    public void usingStringUtils_whenCallingRemoveMostCharactersWithStringAndFoundedCharacter_thenCharacterShouldBeRemoved() {
        assertEquals("00123", StringUtils.removeRightMostCharacters("0012300", '0'));
    }

    @Test
    public void usingStringUtils_whenCallingRemoveMostCharactersWithStringAndNotFoundedCharacter_thenShouldReturnSameString() {
        assertEquals("0012300", StringUtils.removeRightMostCharacters("0012300", '3'));
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingLongestCommonSubsequenceWithNullFirstString_thenShouldThrowException() {
        StringUtils.longestCommonSubsequence(null, "second_string");
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingLongestCommonSubsequenceWithNullSecondString_thenShouldThrowException() {
        StringUtils.longestCommonSubsequence("first_string", null);
    }

    @Test
    public void usingStringUtils_whenCallingLongestCommonSubsequenceWithTwoValidStrings_thenShouldReturnTheResult() {
        assertEquals("aa", StringUtils.longestCommonSubsequence("ahmad", "talal"));
    }

    @Test
    public void usingStringUtils_whenCallingLongestCommonSubsequenceWithTwoValidStrings_2_thenShouldReturnTheResult() {
        assertEquals("aal", StringUtils.longestCommonSubsequence("ahmadl", "talal"));
    }

    @Test
    public void usingStringUtils_whenCallingLongestCommonSubsequenceWithTwoValidStrings_3_thenShouldReturnTheResult() {
        assertEquals("aalaxa", StringUtils.longestCommonSubsequence("ahmadlaxxxxxxa", "talalProgressoftaxnaccexpted"));
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingFastContainsWithNullFirstString_thenShouldThrowException() {
        StringUtils.fastContains(null, "second_string");
    }

    @Test(expected = StringUtils.InvalidStringException.class)
    public void usingStringUtils_whenCallingFastContainsWithNullSecondString_thenShouldThrowException() {
        StringUtils.fastContains("first_string", null);
    }

    @Test
    public void usingStringUtils_whenCallingFastContainsWithEmptyString_thenShouldReturnFalse() {
        assertFalse(StringUtils.fastContains("", "pattern"));
    }

    @Test
    public void usingStringUtils_whenCallingFastContainsWithSpacesString_thenShouldReturnFalse() {
        assertFalse(StringUtils.fastContains("    ", "pattern"));
    }

    @Test
    public void usingStringUtils_whenCallingFastContainsWithEmptyPattern_thenShouldReturnFalse() {
        assertFalse(StringUtils.fastContains("string", ""));
    }

    @Test
    public void usingStringUtils_whenCallingFastContainsWithSpacesPattern_thenShouldReturnFalse() {
        assertFalse(StringUtils.fastContains("string", "    "));
    }

    @Test
    public void usingStringUtils_whenCallingFastContainsWithStringAndExistedPattern_thenShouldReturnTrue() {
        assertTrue(StringUtils.fastContains("first_string", "st"));
    }

}
