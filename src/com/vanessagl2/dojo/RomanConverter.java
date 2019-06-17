package com.vanessagl2.dojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanConverter {
    public int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; // array containing all of the values
    public String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; // array containing all of the numbers

    public Map<String, String> translate(List<String> allDigits) {
        Map<String, String> results = new HashMap<>();

        int i = 0;
        while (i < allDigits.size()) {
            String result = ""; // Declare a string to hold the numbers

            int n = Integer.valueOf(allDigits.get(i));

            for (int j = 0; j < numbers.length; j++) { // loop through all the values
                while (n >= numbers[j]) {
                    result += letters[j]; // Add the letter to the String
                    n -= numbers[j]; // Subtract the amount from the value
                }
            }

            results.put(allDigits.get(i), result);
            i++;
        }

        return results;
    }
}
