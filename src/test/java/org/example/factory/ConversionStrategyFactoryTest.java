package org.example.factory;

import org.example.concrete.converter.*;
import org.example.strategy.ConversionStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConversionStrategyFactoryTest {

    @Test
    void getHourConversionStrategy_Returns_IncrementHourConverter() {
        ConversionStrategy strategy = ConversionStrategyFactory.getHourConversionStrategy(1, 45);

        assertTrue(strategy instanceof IncrementHourConverter);
    }

    @Test
    void getHourConversionStrategy_Returns_MidnightConverter() {
        ConversionStrategy strategy = ConversionStrategyFactory.getHourConversionStrategy(0, 43);

        assertTrue(strategy instanceof MidnightConverter);
    }

    @Test
    void getHourConversionStrategy_Returns_DefaultConverter() {
        ConversionStrategy strategy = ConversionStrategyFactory.getHourConversionStrategy(1, 43);

        assertTrue(strategy instanceof DefaultConverter);
    }

    @Test
    void getMinutesConversionStrategy_Returns_ReverseMinutesConverter() {
        ConversionStrategy strategy = ConversionStrategyFactory.getMinutesConversionStrategy(45);

        assertTrue(strategy instanceof ReverseMinutesConverter);
    }

    @Test
    void getMinutesConversionStrategy_Returns_ColloquialFormConverter() {
        ConversionStrategy strategy = ConversionStrategyFactory.getMinutesConversionStrategy(10);

        assertTrue(strategy instanceof ColloquialFormConverter);
    }
}
