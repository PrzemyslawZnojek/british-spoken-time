package org.example.factory;

import org.example.strategy.ConversionStrategy;
import org.example.concrete.converter.*;

public class ConversionStrategyFactory {
    public static ConversionStrategy getHourConversionStrategy(Integer hour, Integer minutes) {
        if (shouldUseSpecialConversion(minutes)) {
            return new IncrementHourConverter();
        } else if (hour == 0) {
            return new MidnightConverter();
        } else {
            return new DefaultConverter();
        }
    }

    public static ConversionStrategy getMinutesConversionStrategy(Integer minutes) {
        if (shouldUseSpecialConversion(minutes)) {
            return new ReverseMinutesConverter();
        } else {
            return new ColloquialFormConverter();
        }
    }

    private static boolean shouldUseSpecialConversion(Integer minutes) {
        return minutes > 30 && minutes % 5 == 0;
    }
}
