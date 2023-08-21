package org.example.translator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslatorTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/final_results.csv", numLinesToSkip = 1)
    void translate_ShouldGenerateTheProperTranslatedTimeToBritishSpokenTime(String input, String expected){
        assertEquals(expected, Translator.translate(input));
    }
}
