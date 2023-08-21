package org.example.formatter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeToSpokenFormFormatterTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/spoken_words_to_format.csv", numLinesToSkip = 1)
    void format_ShouldProperFormatConvertedNumbers(String hourAsSpokenWord, String minutesAsSpokenWord, Integer minutes, String expected){
        assertEquals(expected, TimeToSpokenFormFormatter.format(hourAsSpokenWord, minutesAsSpokenWord, minutes));
    }
}
