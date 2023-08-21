package org.example.concrete.converter;

import org.example.strategy.ConversionStrategy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseMinutesConverterTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/concrete.converter/reverse_minutes_converter.csv", numLinesToSkip = 1)
    void convert_ShouldReturnProperConvertedNumber(Integer input, String expected){
        ConversionStrategy converter = new ReverseMinutesConverter();
        assertEquals(expected, converter.convert(input));
    }
}
