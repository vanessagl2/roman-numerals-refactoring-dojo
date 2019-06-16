package com.vanessagl2.dojo;

import java.util.List;
import java.util.Map;

public class RomanNumeralsTranslationExecutor {
    public static void main(String[] args) throws Exception {
        List<String> arabicNumbers = new InputFileReader().retrieveFileContentAsList("input.txt");

        Map<String, String> translatedRomanNumerals = new RomanNumeralsTranslator(arabicNumbers).translateToRoman();

        translatedRomanNumerals
                .entrySet()
                .forEach(result -> System.out.println(result + " = " + translatedRomanNumerals.get(result)));
    }
}
