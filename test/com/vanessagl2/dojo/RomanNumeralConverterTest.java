package com.vanessagl2.dojo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralConverterTest {
    private RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

    @Test
    void shouldMapBaseValueFromArabicToRoman() {
        int one = 1;

        assertEquals(romanNumeralConverter.convertToRoman(one), "I");
    }

    @Test
    void shouldMapNineValueFromArabicToRoman() {
        int nine = 9;

        assertEquals(romanNumeralConverter.convertToRoman(nine), "IX");
    }

    @Test
    void shouldMapFourteenValueFromArabicToRoman() {
        int fourteen = 14;

        assertEquals(romanNumeralConverter.convertToRoman(fourteen), "XIV");
    }

    @Test
    void shouldMapFortyNineValueFromArabicToRoman() {
        int fortyeight = 48;

        assertEquals(romanNumeralConverter.convertToRoman(fortyeight), "XLVIII");
    }

    @Test
    void shouldMapEightHundredTwentyNineValueFromArabicToRoman() {
        int eightHundredTwentyNine = 829;

        assertEquals(romanNumeralConverter.convertToRoman(eightHundredTwentyNine), "DCCCXXIX");
    }

    @Test
    void shouldMapOneThousandValueFromArabicToRoman() {
        int oneThousand = 1000;

        assertEquals(romanNumeralConverter.convertToRoman(oneThousand), "M");
    }

    @Test
    void shouldMapNineHundredValueFromArabicToRoman() {
        int nineHundred = 900;

        assertEquals(romanNumeralConverter.convertToRoman(nineHundred), "CM");
    }

}