package org.example.concrete.converter;

import org.example.strategy.ConversionStrategy;
import org.example.converter.NumberToWordConverter;

public class DefaultConverter implements ConversionStrategy {
    @Override
    public String convert(Integer value) {
        return NumberToWordConverter.convert(value);
    }
}
