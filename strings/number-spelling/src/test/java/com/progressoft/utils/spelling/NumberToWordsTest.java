package com.progressoft.utils.spelling;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToWordsTest {

    private NumberToWords numberToWords;

    @Before
    public void setUp() {
        numberToWords = new NumberToWords();
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberZero_thenShouldReturnWordZero() {
        assertEquals("zero",numberToWords.spell(0));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOne_thenShouldReturnWordOne() {
        assertEquals("one",numberToWords.spell(1));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTwo_thenShouldReturnWordTwo() {
        assertEquals("two",numberToWords.spell(2));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberThree_thenShouldReturnWordThree() {
        assertEquals("three",numberToWords.spell(3));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberFour_thenShouldReturnWordFour() {
        assertEquals("four",numberToWords.spell(4));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberFive_thenShouldReturnWordFive() {
        assertEquals("five",numberToWords.spell(5));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSix_thenShouldReturnWordSix() {
        assertEquals("six",numberToWords.spell(6));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSeven_thenShouldReturnWordSeve() {
        assertEquals("seven",numberToWords.spell(7));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEight_thenShouldReturnWordEight() {
        assertEquals("eight",numberToWords.spell(8));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberNine_thenShouldReturnWordNine() {
        assertEquals("nine",numberToWords.spell(9));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTen_thenShouldReturnWordTen() {
        assertEquals("ten",numberToWords.spell(10));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordEleven() {
        assertEquals("eleven",numberToWords.spell(11));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordtwelve() {
        assertEquals("twelve",numberToWords.spell(12));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordthirteen() {
        assertEquals("thirteen",numberToWords.spell(13));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfourteen() {
        assertEquals("fourteen",numberToWords.spell(14));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfifteen() {
        assertEquals("fifteen",numberToWords.spell(15));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordsixteen() {
        assertEquals("sixteen",numberToWords.spell(16));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordseventeen() {
        assertEquals("seventeen",numberToWords.spell(17));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordeighteen() {
        assertEquals("eighteen",numberToWords.spell(18));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordnineteen() {
        assertEquals("nineteen",numberToWords.spell(19));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordtwenty() {
        assertEquals("twenty",numberToWords.spell(20));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordthirty() {
        assertEquals("thirty",numberToWords.spell(30));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordforty() {
        assertEquals("forty",numberToWords.spell(40));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordfifty() {
        assertEquals("fifty",numberToWords.spell(50));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordsixty() {
        assertEquals("sixty",numberToWords.spell(60));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordseventy() {
        assertEquals("seventy",numberToWords.spell(70));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordeighty() {
        assertEquals("eighty",numberToWords.spell(80));
    }
    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEleven_thenShouldReturnWordninety() {
        assertEquals("ninety",numberToWords.spell(90));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTwentyOne_thenShouldReturnWordTwentyOne() {
        assertEquals("twenty-one",numberToWords.spell(21));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberEightySeven_thenShouldReturnWordEightySeven() {
        assertEquals("eighty-seven",numberToWords.spell(87));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundred_thenShouldReturnWordOneHundred() {
        assertEquals("one hundred",numberToWords.spell(100));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberNineHundred_thenShouldReturnWordNineHundred() {
        assertEquals("nine hundred",numberToWords.spell(900));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredOne_thenShouldReturnWordOneHundredOne() {
        assertEquals("one hundred one",numberToWords.spell(101));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredEleven_thenShouldReturnWordOneHundredEleven() {
        assertEquals("one hundred eleven",numberToWords.spell(111));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredSixtyTwo_thenShouldReturnWordOneHundredSixtyTwo() {
        assertEquals("one hundred sixty-two",numberToWords.spell(162));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousand_thenShouldReturnWordOneThousand() {
        assertEquals("one thousand",numberToWords.spell(1000));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandOne_thenShouldReturnWordOneThousandOne() {
        assertEquals("one thousand one",numberToWords.spell(1001));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandEleven_thenShouldReturnWordOneThousandEleven() {
        assertEquals("one thousand eleven",numberToWords.spell(1011));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenThousand_thenShouldReturnWordTenThousand() {
        assertEquals("ten thousand",numberToWords.spell(10000));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberThirtyTwoThousandNineHundredFiftySix_thenShouldReturnWordThirtyTwoThousandNineHundredFiftySix() {
        assertEquals("thirty-two thousand nine hundred fifty-six",numberToWords.spell(32956));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredThousand_thenShouldReturnWordOneHundredThousand() {
        assertEquals("one hundred thousand",numberToWords.spell(100000));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberSevenHundredFiftyOneTHousandTwoHundredThirtySix_thenShouldReturnWordSevenHundredFiftyOneTHousandTwoHundredThirtySix() {
        assertEquals("seven hundred fifty-one thousand two hundred thirty-six",numberToWords.spell(751236));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneThousandOneHundred_thenShouldReturnWordOneThousandOneHundred() {
        assertEquals("one thousand one hundred",numberToWords.spell(1100));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneMillion_thenShouldReturnWordOneThousandOneMillion() {
        assertEquals("one million",numberToWords.spell(1000000));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingEightMillionFiveHundredTwentyThreeThousandFourHundredNinetyFive_thenShouldReturnTheNumberAsWords() {
        assertEquals("eight million five hundred twenty-three thousand four hundred ninety-five",numberToWords.spell(8523495));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenMillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten million",numberToWords.spell(10_000_000));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredMillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred million",numberToWords.spell(100_000_000));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one billion",numberToWords.spell(1_000_000_000));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberTenBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("ten billion",numberToWords.spell(10_000_000_000L));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingNumberOneHundredBillion_thenShouldReturnTheNumberAsWords() {
        assertEquals("one hundred billion",numberToWords.spell(100_000_000_000L));
    }

    @Test
    public void givenNumberToWords_whenAskigForSpellingLargeNumber_1_thenShouldReturnTheNumberAsWords() {
        assertEquals("four hundred fifty-three billion eight hundred seventy-five million one hundred twenty-three thousand four hundred fifty-nine",numberToWords.spell(453_875_123_459L));
    }

}
