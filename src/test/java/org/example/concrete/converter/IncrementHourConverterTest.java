package org.example.concrete.converter;

import org.example.strategy.ConversionStrategy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementHourConverterTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/concrete.converter/increment_hour_converter.csv", numLinesToSkip = 1)
    void convert_ShouldReturnProperConvertedNumber(Integer input, String expected){
        ConversionStrategy converter = new IncrementHourConverter();
        assertEquals(expected, converter.convert(input));
    }
}
