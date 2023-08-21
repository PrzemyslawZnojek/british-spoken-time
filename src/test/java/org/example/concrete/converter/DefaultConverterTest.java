package org.example.concrete.converter;

import org.example.strategy.ConversionStrategy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultConverterTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/defaults.csv", numLinesToSkip = 1)
    void convert_ShouldReturnProperConvertedNumber(Integer input, String expected){
        ConversionStrategy converter = new DefaultConverter();
        assertEquals(expected, converter.convert(input));
    }
}
