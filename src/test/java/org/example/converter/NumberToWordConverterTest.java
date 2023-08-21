package org.example.converter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberToWordConverterTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/defaults.csv", numLinesToSkip = 1)
    void convert_ShouldReturnProperConvertedNumber(Integer input, String expected){
        assertEquals(expected, NumberToWordConverter.convert(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/colloquials.csv", numLinesToSkip = 1)
    void convertWithColloquialFormChecking_ShouldReturnProperConvertedNumber(Integer input, String expected){
        assertEquals(expected, NumberToWordConverter.convertWithColloquialFormChecking(input));
    }
}
