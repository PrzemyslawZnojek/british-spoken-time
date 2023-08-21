package org.example.concrete.converter;

import org.example.strategy.ConversionStrategy;
import org.example.converter.NumberToWordConverter;

public class IncrementHourConverter implements ConversionStrategy {

    @Override
    public String convert(Integer value) {
        int hour = value + 1;
        if (hour == 13) {
            hour = 1;
        }
        return NumberToWordConverter.convert(hour);
    }
}
