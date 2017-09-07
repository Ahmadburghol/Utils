package com.progressoft.utils.spelling.english;

import com.progressoft.utils.spelling.CurrencyProvider;
import com.progressoft.utils.spelling.NumbersSpeller;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class NumbersToEnglishWordsTest {

    private static final CurrencyProvider DOLLAR_CURRENCY_PROVIDER = new CurrencyProvider() {

        @Override
        public String integerPart(String number) {
            return number.equals("1") ? "dollar" : "dollars";
        }

        @Override
        public String fractionPart(String number) {
            return number.equals("1") ? "cent" : "cents";
        }

        @Override
        public int fractionsLength() {
            return 2;
        }
    };
    private NumbersSpeller numberToWords;

    @Before
    public void setUp() {
        numberToWords = new NumbersToEnglishWords();
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberZero_thenShouldReturnWordZero() {
        assertEquals("zero", numberToWords.spell(BigDecimal.valueOf(0)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOne_thenShouldReturnWordOne() {
        assertEquals("one", numberToWords.spell(BigDecimal.valueOf(1)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberMinusOne_thenShouldReturnWordMinusOne() {
        assertEquals("minus one", numberToWords.spell(BigDecimal.valueOf(-1)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTwo_thenShouldReturnWordTwo() {
        assertEquals("two", numberToWords.spell(BigDecimal.valueOf(2)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberThree_thenShouldReturnWordThree() {
        assertEquals("three", numberToWords.spell(BigDecimal.valueOf(3)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberFour_thenShouldReturnWordFour() {
        assertEquals("four", numberToWords.spell(BigDecimal.valueOf(4)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberFive_thenShouldReturnWordFive() {
        assertEquals("five", numberToWords.spell(BigDecimal.valueOf(5)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSix_thenShouldReturnWordSix() {
        assertEquals("six", numberToWords.spell(BigDecimal.valueOf(6)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSeven_thenShouldReturnWordSeve() {
        assertEquals("seven", numberToWords.spell(BigDecimal.valueOf(7)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEight_thenShouldReturnWordEight() {
        assertEquals("eight", numberToWords.spell(BigDecimal.valueOf(8)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberNine_thenShouldReturnWordNine() {
        assertEquals("nine", numberToWords.spell(BigDecimal.valueOf(9)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTen_thenShouldReturnWordTen() {
        assertEquals("ten", numberToWords.spell(BigDecimal.valueOf(10)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordEleven() {
        assertEquals("eleven", numberToWords.spell(BigDecimal.valueOf(11)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordtwelve() {
        assertEquals("twelve", numberToWords.spell(BigDecimal.valueOf(12)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordthirteen() {
        assertEquals("thirteen", numberToWords.spell(BigDecimal.valueOf(13)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfourteen() {
        assertEquals("fourteen", numberToWords.spell(BigDecimal.valueOf(14)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfifteen() {
        assertEquals("fifteen", numberToWords.spell(BigDecimal.valueOf(15)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordsixteen() {
        assertEquals("sixteen", numberToWords.spell(BigDecimal.valueOf(16)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordseventeen() {
        assertEquals("seventeen", numberToWords.spell(BigDecimal.valueOf(17)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordeighteen() {
        assertEquals("eighteen", numberToWords.spell(BigDecimal.valueOf(18)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordnineteen() {
        assertEquals("nineteen", numberToWords.spell(BigDecimal.valueOf(19)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordtwenty() {
        assertEquals("twenty", numberToWords.spell(BigDecimal.valueOf(20)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordthirty() {
        assertEquals("thirty", numberToWords.spell(BigDecimal.valueOf(30)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordforty() {
        assertEquals("forty", numberToWords.spell(BigDecimal.valueOf(40)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfifty() {
        assertEquals("fifty", numberToWords.spell(BigDecimal.valueOf(50)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordsixty() {
        assertEquals("sixty", numberToWords.spell(BigDecimal.valueOf(60)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordseventy() {
        assertEquals("seventy", numberToWords.spell(BigDecimal.valueOf(70)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordeighty() {
        assertEquals("eighty", numberToWords.spell(BigDecimal.valueOf(80)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordninety() {
        assertEquals("ninety", numberToWords.spell(BigDecimal.valueOf(90)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTwentyOne_thenShouldReturnWordTwentyOne() {
        assertEquals("twenty-one", numberToWords.spell(BigDecimal.valueOf(21)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEightySeven_thenShouldReturnWordEightySeven() {
        assertEquals("eighty-seven", numberToWords.spell(BigDecimal.valueOf(87)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundred_thenShouldReturnWordOneHundred() {
        assertEquals("one hundred", numberToWords.spell(BigDecimal.valueOf(100)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberNineHundred_thenShouldReturnWordNineHundred() {
        assertEquals("nine hundred", numberToWords.spell(BigDecimal.valueOf(900)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredOne_thenShouldReturnWordOneHundredOne() {
        assertEquals("one hundred one", numberToWords.spell(BigDecimal.valueOf(101)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredEleven_thenShouldReturnWordOneHundredEleven() {
        assertEquals("one hundred eleven", numberToWords.spell(BigDecimal.valueOf(111)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredSixtyTwo_thenShouldReturnWordOneHundredSixtyTwo() {
        assertEquals("one hundred sixty-two", numberToWords.spell(BigDecimal.valueOf(162)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousand_thenShouldReturnWordOneThousand() {
        assertEquals("one thousand", numberToWords.spell(BigDecimal.valueOf(1000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandOne_thenShouldReturnWordOneThousandOne() {
        assertEquals("one thousand one", numberToWords.spell(BigDecimal.valueOf(1001)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandEleven_thenShouldReturnWordOneThousandEleven() {
        assertEquals("one thousand eleven", numberToWords.spell(BigDecimal.valueOf(1011)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenThousand_thenShouldReturnWordTenThousand() {
        assertEquals("ten thousand", numberToWords.spell(BigDecimal.valueOf(10000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberThirtyTwoThousandNineHundredFiftySix_thenShouldReturnWordThirtyTwoThousandNineHundredFiftySix() {
        assertEquals("thirty-two thousand nine hundred fifty-six", numberToWords.spell(BigDecimal.valueOf(32956)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredThousand_thenShouldReturnWordOneHundredThousand() {
        assertEquals("one hundred thousand", numberToWords.spell(BigDecimal.valueOf(100000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSevenHundredFiftyOneTHousandTwoHundredThirtySix_thenShouldReturnWordSevenHundredFiftyOneTHousandTwoHundredThirtySix() {
        assertEquals("seven hundred fifty-one thousand two hundred thirty-six", numberToWords.spell(BigDecimal.valueOf(751236)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandOneHundred_thenShouldReturnWordOneThousandOneHundred() {
        assertEquals("one thousand one hundred", numberToWords.spell(BigDecimal.valueOf(1100)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneMillion_thenShouldReturnWordOneThousandOneMillion() {
        assertEquals("one million", numberToWords.spell(BigDecimal.valueOf(1000000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingEightMillionFiveHundredTwentyThreeThousandFourHundredNinetyFive_thenShouldReturnTheNumberAsWords() {
        assertEquals("eight million five hundred twenty-three thousand four hundred ninety-five", numberToWords.spell(BigDecimal.valueOf(8523495)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingMinusEightMillionFiveHundredTwentyThreeThousandFourHundredNinetyFive_thenShouldReturnTheNumberAsWords() {
        assertEquals("minus eight million five hundred twenty-three thousand four hundred ninety-five", numberToWords.spell(BigDecimal.valueOf(-8523495)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenMillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten million", numberToWords.spell(BigDecimal.valueOf(10_000_000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredMillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred million", numberToWords.spell(BigDecimal.valueOf(100_000_000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one billion", numberToWords.spell(BigDecimal.valueOf(1_000_000_000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten billion", numberToWords.spell(BigDecimal.valueOf(10_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred billion", numberToWords.spell(BigDecimal.valueOf(100_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_1_thenShouldReturnTheNumberAsWords() {
        assertEquals("four hundred fifty-three billion eight hundred seventy-five million one hundred twenty-three thousand four hundred fifty-nine", numberToWords.spell(BigDecimal.valueOf(453_875_123_459L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_2_thenShouldReturnTheNumberAsWords() {
        assertEquals("nine billion nine hundred ninety million", numberToWords.spell(BigDecimal.valueOf(9_990_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_3_thenShouldReturnTheNumberAsWords() {
        assertEquals("one trillion", numberToWords.spell(BigDecimal.valueOf(1_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_4_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten trillion", numberToWords.spell(BigDecimal.valueOf(10_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_5_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred trillion", numberToWords.spell(BigDecimal.valueOf(100_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_6_thenShouldReturnTheNumberAsWords() {
        assertEquals("six hundred thirty-four trillion five hundred twenty-three billion eight hundred fifty-four million seven hundred sixty-five thousand four hundred seventy-two", numberToWords.spell(BigDecimal.valueOf(6_34_523_854_765_472L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_7_thenShouldReturnTheNumberAsWords() {
        assertEquals("one quadrillion", numberToWords.spell(BigDecimal.valueOf(1_000_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_8_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten quadrillion", numberToWords.spell(BigDecimal.valueOf(10_000_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_9_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred quadrillion", numberToWords.spell(BigDecimal.valueOf(100_000_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_10_thenShouldReturnTheNumberAsWords() {
        assertEquals("eight hundred seventy-six quadrillion five hundred forty-three trillion seven hundred sixty-five billion eight hundred seventy-six million seven hundred fifty-six thousand eight hundred seventy-nine", numberToWords.spell(BigDecimal.valueOf(8_76_543_765_876_756_879L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_11_thenShouldReturnTheNumberAsWords() {
        assertEquals("one quintillion", numberToWords.spell(BigDecimal.valueOf(1_000_000_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_thenShouldReturnTheNumberAsWords() {
        assertEquals("one and nine tenths", numberToWords.spell(new BigDecimal("1.9")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_2_thenShouldReturnTheNumberAsWords() {
        assertEquals("nine tenths", numberToWords.spell(new BigDecimal("0.9")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_3_thenShouldReturnTheNumberAsWords() {
        assertEquals("nine tenths", numberToWords.spell(new BigDecimal(".9")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_4_thenShouldReturnTheNumberAsWords() {
        assertEquals("zero", numberToWords.spell(new BigDecimal("0.0")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_5_thenShouldReturnTheNumberAsWords() {
        assertEquals("one", numberToWords.spell(new BigDecimal("1.0")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_6_thenShouldReturnTheNumberAsWords() {
        assertEquals("zero", numberToWords.spell(new BigDecimal("00.0")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_7_thenShouldReturnTheNumberAsWords() {
        assertEquals("one", numberToWords.spell(new BigDecimal("1.00")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_8_thenShouldReturnTheNumberAsWords() {
        assertEquals("one and one tenth", numberToWords.spell(new BigDecimal("1.1")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_9_thenShouldReturnTheNumberAsWords() {
        assertEquals("one and one hundredth", numberToWords.spell(new BigDecimal("1.01")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_10_thenShouldReturnTheNumberAsWords() {
        assertEquals("one and one tenth", numberToWords.spell(new BigDecimal("1.10")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_11_thenShouldReturnTheNumberAsWords() {
        assertEquals("one and eleven hundredths", numberToWords.spell(new BigDecimal("1.11")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_12_thenShouldReturnTheNumberAsWords() {
        assertEquals("eleven hundredths", numberToWords.spell(new BigDecimal(".11")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_13_thenShouldReturnTheNumberAsWords() {
        assertEquals("eleven hundredths", numberToWords.spell(new BigDecimal(".11000000")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_14_thenShouldReturnTheNumberAsWords() {
        assertEquals("one thousandth", numberToWords.spell(new BigDecimal("0.001")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_15_thenShouldReturnTheNumberAsWords() {
        assertEquals("one ten-thousandth", numberToWords.spell(new BigDecimal("0.0001")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_16_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred-thousandth", numberToWords.spell(new BigDecimal("0.00001")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_17_thenShouldReturnTheNumberAsWords() {
        assertEquals("one millionth", numberToWords.spell(new BigDecimal("0.000001")));
    }


    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_18_thenShouldReturnTheNumberAsWords() {
        assertEquals("one ten-millionth", numberToWords.spell(new BigDecimal("0.0000001")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_19_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred-millionth", numberToWords.spell(new BigDecimal("0.00000001")));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingBigDecimal_20_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred one ten-thousandths", numberToWords.spell(new BigDecimal("0.010100")));
    }

    @Test
    public void givenNumberToWardsWithDollarCurrency_whenAskingForSpellDecimalValue_thenShouldReturnTheNumberAsWords() {
        assertEquals("one dollar and one cent",
                new NumbersToEnglishWords().withCurrencyProvider(DOLLAR_CURRENCY_PROVIDER).spell(new BigDecimal("1.01")));
    }

    @Test
    public void givenNumberToWardsWithDollarCurrency_whenAskingForSpellDecimalValue_2_thenShouldReturnTheNumberAsWords() {
        assertEquals("one dollar and ten cents",
                new NumbersToEnglishWords().withCurrencyProvider(DOLLAR_CURRENCY_PROVIDER).spell(new BigDecimal("1.1")));
    }

    @Test
    public void givenNumberToWardsWithDollarCurrency_whenAskingForSpellDecimalValue_3_thenShouldReturnTheNumberAsWords() {
        assertEquals("one dollar and ten cents",
                new NumbersToEnglishWords().withCurrencyProvider(DOLLAR_CURRENCY_PROVIDER).spell(new BigDecimal("1.10000")));
    }

    @Test
    public void givenNumberToWardsWithDollarCurrency_whenAskingForSpellDecimalValue_4_thenShouldReturnTheNumberAsWords() {
        assertEquals("two dollars and three cents",
                new NumbersToEnglishWords().withCurrencyProvider(DOLLAR_CURRENCY_PROVIDER).spell(new BigDecimal("2.03")));
    }

    @Test
    public void givenNumberToWardsWithDollarCurrency_whenAskingForSpellDecimalValue_5_thenShouldReturnTheNumberAsWords() {
        assertEquals("two dollars and thirty cents",
                new NumbersToEnglishWords().withCurrencyProvider(DOLLAR_CURRENCY_PROVIDER).spell(new BigDecimal("2.3")));
    }

    @Test
    public void givenNumberToWardsWithDollarCurrency_whenAskingForSpellDecimalValue_6_thenShouldReturnTheNumberAsWords() {
        assertEquals("two dollars and thirty-eight cents",
                new NumbersToEnglishWords().withCurrencyProvider(DOLLAR_CURRENCY_PROVIDER).spell(new BigDecimal("2.38")));
    }

    @Test(expected = NumbersSpeller.InvalidFractionsForProvidedCurrencyException.class)
    public void givenNumberToWardsWithDollarCurrency_whenAskingForSpellDecimalValueWithFractionsLongestThanCurrencyFractionsLength_thenShouldReturnTheNumberAsWords() {
        new NumbersToEnglishWords().withCurrencyProvider(DOLLAR_CURRENCY_PROVIDER).spell(new BigDecimal("1.10005"));
    }

}
