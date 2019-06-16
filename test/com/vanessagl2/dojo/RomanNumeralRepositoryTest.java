package com.vanessagl2.dojo;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralRepositoryTest {

    private Map<Integer, String> expectedResult = new HashMap<Integer, String>() {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};

    @Test
    void shouldReturnRomanAndArabicNumeralsMapping() {
        RomanNumeralRepository repository = new RomanNumeralRepository();

        Map<Integer, String> romanNumeralMap = repository.retrieveMapping();

        assertEquals(romanNumeralMap, expectedResult);
    }
}