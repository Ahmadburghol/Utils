package com.progressoft.utils.spelling.english;

import com.progressoft.utils.spelling.NumbersSpeller;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class NumbersToEnglishWordsTest {

    private NumbersSpeller numberToWords;

    @Before
    public void setUp() {
        numberToWords = new NumbersToEnglishWords();
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberZero_thenShouldReturnWordZero() {
        assertEquals("zero", numberToWords.spell(BigInteger.valueOf(0)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOne_thenShouldReturnWordOne() {
        assertEquals("one", numberToWords.spell(BigInteger.valueOf(1)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberMinusOne_thenShouldReturnWordMinusOne() {
        assertEquals("minus one", numberToWords.spell(BigInteger.valueOf(-1)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTwo_thenShouldReturnWordTwo() {
        assertEquals("two", numberToWords.spell(BigInteger.valueOf(2)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberThree_thenShouldReturnWordThree() {
        assertEquals("three", numberToWords.spell(BigInteger.valueOf(3)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberFour_thenShouldReturnWordFour() {
        assertEquals("four", numberToWords.spell(BigInteger.valueOf(4)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberFive_thenShouldReturnWordFive() {
        assertEquals("five", numberToWords.spell(BigInteger.valueOf(5)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSix_thenShouldReturnWordSix() {
        assertEquals("six", numberToWords.spell(BigInteger.valueOf(6)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSeven_thenShouldReturnWordSeve() {
        assertEquals("seven", numberToWords.spell(BigInteger.valueOf(7)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEight_thenShouldReturnWordEight() {
        assertEquals("eight", numberToWords.spell(BigInteger.valueOf(8)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberNine_thenShouldReturnWordNine() {
        assertEquals("nine", numberToWords.spell(BigInteger.valueOf(9)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTen_thenShouldReturnWordTen() {
        assertEquals("ten", numberToWords.spell(BigInteger.valueOf(10)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordEleven() {
        assertEquals("eleven", numberToWords.spell(BigInteger.valueOf(11)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordtwelve() {
        assertEquals("twelve", numberToWords.spell(BigInteger.valueOf(12)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordthirteen() {
        assertEquals("thirteen", numberToWords.spell(BigInteger.valueOf(13)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfourteen() {
        assertEquals("fourteen", numberToWords.spell(BigInteger.valueOf(14)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfifteen() {
        assertEquals("fifteen", numberToWords.spell(BigInteger.valueOf(15)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordsixteen() {
        assertEquals("sixteen", numberToWords.spell(BigInteger.valueOf(16)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordseventeen() {
        assertEquals("seventeen", numberToWords.spell(BigInteger.valueOf(17)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordeighteen() {
        assertEquals("eighteen", numberToWords.spell(BigInteger.valueOf(18)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordnineteen() {
        assertEquals("nineteen", numberToWords.spell(BigInteger.valueOf(19)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordtwenty() {
        assertEquals("twenty", numberToWords.spell(BigInteger.valueOf(20)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordthirty() {
        assertEquals("thirty", numberToWords.spell(BigInteger.valueOf(30)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordforty() {
        assertEquals("forty", numberToWords.spell(BigInteger.valueOf(40)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfifty() {
        assertEquals("fifty", numberToWords.spell(BigInteger.valueOf(50)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordsixty() {
        assertEquals("sixty", numberToWords.spell(BigInteger.valueOf(60)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordseventy() {
        assertEquals("seventy", numberToWords.spell(BigInteger.valueOf(70)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordeighty() {
        assertEquals("eighty", numberToWords.spell(BigInteger.valueOf(80)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordninety() {
        assertEquals("ninety", numberToWords.spell(BigInteger.valueOf(90)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTwentyOne_thenShouldReturnWordTwentyOne() {
        assertEquals("twenty-one", numberToWords.spell(BigInteger.valueOf(21)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEightySeven_thenShouldReturnWordEightySeven() {
        assertEquals("eighty-seven", numberToWords.spell(BigInteger.valueOf(87)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundred_thenShouldReturnWordOneHundred() {
        assertEquals("one hundred", numberToWords.spell(BigInteger.valueOf(100)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberNineHundred_thenShouldReturnWordNineHundred() {
        assertEquals("nine hundred", numberToWords.spell(BigInteger.valueOf(900)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredOne_thenShouldReturnWordOneHundredOne() {
        assertEquals("one hundred one", numberToWords.spell(BigInteger.valueOf(101)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredEleven_thenShouldReturnWordOneHundredEleven() {
        assertEquals("one hundred eleven", numberToWords.spell(BigInteger.valueOf(111)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredSixtyTwo_thenShouldReturnWordOneHundredSixtyTwo() {
        assertEquals("one hundred sixty-two", numberToWords.spell(BigInteger.valueOf(162)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousand_thenShouldReturnWordOneThousand() {
        assertEquals("one thousand", numberToWords.spell(BigInteger.valueOf(1000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandOne_thenShouldReturnWordOneThousandOne() {
        assertEquals("one thousand one", numberToWords.spell(BigInteger.valueOf(1001)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandEleven_thenShouldReturnWordOneThousandEleven() {
        assertEquals("one thousand eleven", numberToWords.spell(BigInteger.valueOf(1011)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenThousand_thenShouldReturnWordTenThousand() {
        assertEquals("ten thousand", numberToWords.spell(BigInteger.valueOf(10000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberThirtyTwoThousandNineHundredFiftySix_thenShouldReturnWordThirtyTwoThousandNineHundredFiftySix() {
        assertEquals("thirty-two thousand nine hundred fifty-six", numberToWords.spell(BigInteger.valueOf(32956)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredThousand_thenShouldReturnWordOneHundredThousand() {
        assertEquals("one hundred thousand", numberToWords.spell(BigInteger.valueOf(100000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSevenHundredFiftyOneTHousandTwoHundredThirtySix_thenShouldReturnWordSevenHundredFiftyOneTHousandTwoHundredThirtySix() {
        assertEquals("seven hundred fifty-one thousand two hundred thirty-six", numberToWords.spell(BigInteger.valueOf(751236)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandOneHundred_thenShouldReturnWordOneThousandOneHundred() {
        assertEquals("one thousand one hundred", numberToWords.spell(BigInteger.valueOf(1100)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneMillion_thenShouldReturnWordOneThousandOneMillion() {
        assertEquals("one million", numberToWords.spell(BigInteger.valueOf(1000000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingEightMillionFiveHundredTwentyThreeThousandFourHundredNinetyFive_thenShouldReturnTheNumberAsWords() {
        assertEquals("eight million five hundred twenty-three thousand four hundred ninety-five", numberToWords.spell(BigInteger.valueOf(8523495)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingMinusEightMillionFiveHundredTwentyThreeThousandFourHundredNinetyFive_thenShouldReturnTheNumberAsWords() {
        assertEquals("minus eight million five hundred twenty-three thousand four hundred ninety-five", numberToWords.spell(BigInteger.valueOf(-8523495)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenMillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten million", numberToWords.spell(BigInteger.valueOf(10_000_000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredMillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred million", numberToWords.spell(BigInteger.valueOf(100_000_000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one billion", numberToWords.spell(BigInteger.valueOf(1_000_000_000)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten billion", numberToWords.spell(BigInteger.valueOf(10_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred billion", numberToWords.spell(BigInteger.valueOf(100_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_1_thenShouldReturnTheNumberAsWords() {
        assertEquals("four hundred fifty-three billion eight hundred seventy-five million one hundred twenty-three thousand four hundred fifty-nine", numberToWords.spell(BigInteger.valueOf(453_875_123_459L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_2_thenShouldReturnTheNumberAsWords() {
        assertEquals("nine billion nine hundred ninety million", numberToWords.spell(BigInteger.valueOf(9_990_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_3_thenShouldReturnTheNumberAsWords() {
        assertEquals("one trillion", numberToWords.spell(BigInteger.valueOf(1_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_4_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten trillion", numberToWords.spell(BigInteger.valueOf(10_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_5_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred trillion", numberToWords.spell(BigInteger.valueOf(100_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_6_thenShouldReturnTheNumberAsWords() {
        assertEquals("six hundred thirty-four trillion five hundred twenty-three billion eight hundred fifty-four million seven hundred sixty-five thousand four hundred seventy-two", numberToWords.spell(BigInteger.valueOf(6_34_523_854_765_472L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_7_thenShouldReturnTheNumberAsWords() {
        assertEquals("one quadrillion", numberToWords.spell(BigInteger.valueOf(1_000_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_8_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten quadrillion", numberToWords.spell(BigInteger.valueOf(10_000_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_9_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred quadrillion", numberToWords.spell(BigInteger.valueOf(100_000_000_000_000_000L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_10_thenShouldReturnTheNumberAsWords() {
        assertEquals("eight hundred seventy-six quadrillion five hundred forty-three trillion seven hundred sixty-five billion eight hundred seventy-six million seven hundred fifty-six thousand eight hundred seventy-nine", numberToWords.spell(BigInteger.valueOf(8_76_543_765_876_756_879L)));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_11_thenShouldReturnTheNumberAsWords() {
        assertEquals("one quintillion", numberToWords.spell(BigInteger.valueOf(1_000_000_000_000_000_000L)));
    }

}
