package org.example.converter;

import org.example.constant.ColloquialForm;
import pl.allegro.finance.tradukisto.ValueConverters;

public class NumberToWordConverter {
    private static final ValueConverters intConverter = ValueConverters.ENGLISH_INTEGER;

    public static String convertWithColloquialFormChecking(Integer value) {
        String minutesAsWord;
        switch (value) {
            case 0 -> minutesAsWord = ColloquialForm.MINUTES_0;
            case 15 -> minutesAsWord = ColloquialForm.MINUTES_15;
            case 30 -> minutesAsWord = ColloquialForm.MINUTES_30;
            default -> minutesAsWord = convert(value);
        }
        return minutesAsWord;
    }

    public static String convert(Integer value) {
        return intConverter.asWords(value).replace("-", " ");
    }
}
