package org.example.concrete.converter;

import org.example.strategy.ConversionStrategy;
import org.example.constant.ColloquialForm;

public class MidnightConverter implements ConversionStrategy {
    @Override
    public String convert(Integer value) {
        return ColloquialForm.MIDNIGHT;
    }
}
