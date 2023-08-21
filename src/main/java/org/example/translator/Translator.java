package org.example.translator;

import org.example.constant.ColloquialForm;
import org.example.factory.ConversionStrategyFactory;
import org.example.formatter.TimeToSpokenFormFormatter;
import org.example.strategy.ConversionStrategy;

public class Translator {
    public static String translate(String time) {
        if (time.equals("12:00")) return ColloquialForm.NOON;
        if (time.equals("00:00") || time.equals("0:00")) return ColloquialForm.MIDNIGHT;

        String[] splitNumbers = time.split(":");
        Integer hour = Integer.valueOf(splitNumbers[0]);
        Integer minutes = Integer.valueOf(splitNumbers[1]);

        ConversionStrategy hourStrategy = ConversionStrategyFactory.getHourConversionStrategy(hour, minutes);
        ConversionStrategy minutesStrategy = ConversionStrategyFactory.getMinutesConversionStrategy(minutes);

        String hourAsSpokenWord = hourStrategy.convert(hour);
        String minutesAsSpokenWord = minutesStrategy.convert(minutes);

        return TimeToSpokenFormFormatter.format(hourAsSpokenWord, minutesAsSpokenWord, minutes);
    }
}
