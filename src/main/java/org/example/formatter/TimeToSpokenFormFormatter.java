package org.example.formatter;

import org.example.constant.ColloquialForm;
import org.example.constant.Preposition;

public class TimeToSpokenFormFormatter {
    public static String format(String hourAsSpokenWord, String minutesAsSpokenWord, Integer minutes){
        if (hourAsSpokenWord.equals(ColloquialForm.MIDNIGHT)) {
            return minutesAsSpokenWord + Preposition.PAST + ColloquialForm.MIDNIGHT;
        }

        if (isColloquialForm(minutes) && minutes <= 30) {
            return minutesAsSpokenWord + Preposition.PAST + hourAsSpokenWord;
        }

        if (isColloquialForm(minutes)) {
            return minutesAsSpokenWord + Preposition.TO + hourAsSpokenWord;
        }

        return hourAsSpokenWord + Preposition.WHITESPACE + minutesAsSpokenWord;
    }

    private static boolean isColloquialForm(Integer minutes) {
        return minutes % 5 == 0 && minutes > 0;
    }
}
