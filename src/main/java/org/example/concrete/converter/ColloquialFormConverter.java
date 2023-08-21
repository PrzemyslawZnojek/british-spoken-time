package org.example.concrete.converter;

import org.example.converter.NumberToWordConverter;
import org.example.strategy.ConversionStrategy;

public class ColloquialFormConverter implements ConversionStrategy {
    @Override
    public String convert(Integer value) {
        return NumberToWordConverter.convertWithColloquialFormChecking(value);
    }
}
