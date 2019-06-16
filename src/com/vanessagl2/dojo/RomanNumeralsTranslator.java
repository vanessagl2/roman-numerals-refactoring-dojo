package com.vanessagl2.dojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumeralsTranslator {
    public final int[] numerals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; // array containing all of the values
    public final String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; // array containing all of the numerals

    public Map<String, String> translate(List<String> allDigits) {
        Map<String, String> results = new HashMap<>();

        for(String number : allDigits) {
            results.put(number, toRoman(Integer.valueOf(number)));
        }

        return results;
    }

    /**
     * Method used to convert a integer to a roman numeral
     */
    public String toRoman(int n) {
        String roman = ""; // Declare a string to hold the numerals
        for (int i = 0; i < numerals.length; i++) { // loop through all the values
            while (n >= numerals[i]) { // Check if the number is greater than the current value
                roman += letters[i]; // Add the letter to the String
                n -= numerals[i]; // Subtract the amount from the value
            }
        }
        return roman; // Return the String
    }
}
