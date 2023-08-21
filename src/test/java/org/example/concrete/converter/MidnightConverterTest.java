package org.example.concrete.converter;

import org.example.constant.ColloquialForm;
import org.example.strategy.ConversionStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MidnightConverterTest {

    @Test
    void convert_ShouldReturnMidnight() {
        ConversionStrategy converter = new MidnightConverter();
        assertEquals(ColloquialForm.MIDNIGHT, converter.convert(10));
    }
}
