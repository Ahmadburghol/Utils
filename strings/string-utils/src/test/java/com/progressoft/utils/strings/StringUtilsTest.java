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
        assertEquals("cba",StringUtils.reverse("abc"));
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
        StringUtils.frequencyOfValue(null,"value");
    }

    @Test(expected = StringUtils.InvalidStringValueException.class)
    public void usingStringUtils_whenCallingFrequencyOfValueWithNullValue_thenShouldThrowException() {
        StringUtils.frequencyOfValue("string",null);
    }

    @Test(expected = StringUtils.InvalidStringValueException.class)
    public void usingStringUtils_whenCallingFrequencyOfValueWithEmptyValue_thenShouldThrowException() {
        StringUtils.frequencyOfValue("string","");
    }

    @Test
    public void usingStringUtils_whenCallingFrequencyOfValueWithValidParams_thenShouldReturnTheFrequency() {
        assertEquals(2,StringUtils.frequencyOfValue("Progressoft","s"));
    }

    @Test
    public void usingStringUtils_whenCallingFrequencyOfValueWithValidParams_2_thenShouldReturnTheFrequency() {
        assertEquals(2,StringUtils.frequencyOfValue("Progressoft Utils test","es"));
    }

    @Test
    public void usingStringUtils_whenCallingFrequencyOfValueWithValidParams_3_thenShouldReturnTheFrequency() {
        assertEquals(4,StringUtils.frequencyOfValue("Progressoft Utils test","t"));
    }

    @Test
    public void usingStringUtils_whenCallingFrequencyOfValueWithNonExistingValue_thenShouldReturnZero() {
        assertEquals(0,StringUtils.frequencyOfValue("Progressoft","x"));
    }

}
