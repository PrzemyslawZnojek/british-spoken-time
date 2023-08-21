package org.example.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TimeValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"1:30", "01:45", "10:15", "12:00", "09:05", "00:00"})
    public void isValidFormat_ShouldReturnTrueWhenTimeFormatIsValid(String input) {
        Assertions.assertTrue(TimeValidator.isValidFormat(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "Just words", "14:00", "1:60", "1:61", "-1:15", "Smart1:61Bear", "six thirty two"})
    public void isValidFormat_shouldReturnFalseWhenTimeFormatIsValid(String input) {
        assertFalse(TimeValidator.isValidFormat(input));
    }
}
