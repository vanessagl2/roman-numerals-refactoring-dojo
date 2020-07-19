package com.vanessagl2.dojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumeralsTranslator {
    private List<String> arabicNumbers;
    private RomanNumeralConverter romanNumeralConverter;

    RomanNumeralsTranslator(List<String> arabicNumbers) {
        this.arabicNumbers = arabicNumbers;
        romanNumeralConverter = new RomanNumeralConverter();
    }

    RomanNumeralsTranslator(List<String> arabicNumbers, RomanNumeralConverter converter) {
        this.arabicNumbers = arabicNumbers;
        romanNumeralConverter = converter;
    }

    Map<String, String> translateToRoman() {
        Map<String, String> romanNumbers = new HashMap<>();

        for (String number : arabicNumbers) {
            romanNumbers.put(number, romanNumeralConverter.convertToRoman(Integer.valueOf(number)));
        }

        return romanNumbers;
    }
}
