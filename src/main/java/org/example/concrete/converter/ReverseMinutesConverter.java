package org.example.concrete.converter;

import org.example.converter.NumberToWordConverter;
import org.example.strategy.ConversionStrategy;

public class ReverseMinutesConverter implements ConversionStrategy {
    @Override
    public String convert(Integer value) {
        Integer minutes = 60 - value;

        return NumberToWordConverter.convertWithColloquialFormChecking(minutes);
    }
}
