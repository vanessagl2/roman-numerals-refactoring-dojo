package com.vanessagl2.dojo;

import java.util.TreeMap;

public class RomanNumeralConverter {
    private final TreeMap<Integer, String> romanArabicBaseMap;

    RomanNumeralConverter() {
        this.romanArabicBaseMap = new TreeMap<>();
        this.romanArabicBaseMap.putAll(new RomanNumeralRepository().retrieveMapping());
    }

    String convertToRoman(int arabicNumber) {
        int remainingOffset = arabicNumber;
        StringBuilder romanResult = new StringBuilder();

        while (remainingOffset > 0) {
            romanResult.append(romanArabicBaseMap.get(romanArabicBaseMap.floorKey(remainingOffset)));

            remainingOffset = remainingOffset - (romanArabicBaseMap.floorKey(remainingOffset));
        }
        return romanResult.toString();
    }
}
