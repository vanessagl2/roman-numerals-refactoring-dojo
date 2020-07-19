package com.vanessagl2.dojo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.doclint.Entity.times;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class RomanNumeralsTranslatorTest {

    @Mock
    private RomanNumeralConverter mockConverter;

    @Test
    void shouldCallRomanNumeralConverterForEachArabicNumber() {
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");

        RomanNumeralsTranslator translator = new RomanNumeralsTranslator(numbers, mockConverter);

        translator.translateToRoman();

        verify(mockConverter).convertToRoman(1);
        verify(mockConverter).convertToRoman(2);
    }
}