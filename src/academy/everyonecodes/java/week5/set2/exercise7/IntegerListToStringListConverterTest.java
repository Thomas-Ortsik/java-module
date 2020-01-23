package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListToStringListConverterTest {
    IntegerListToStringListConverter integerListToStringListConverter = new IntegerListToStringListConverter();

    @Test
    void convert() {
        List<Integer> input = List.of(10, 11, 2, 4, 6);
        List<String> expected = List.of("10", "11", "2", "4", "6");
        List<String> result = integerListToStringListConverter.convert(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void convertShouldReturnEmptyList() {
        List<Integer> input = List.of();
        List<String> expected = List.of();
        List<String> result = integerListToStringListConverter.convert(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void convertShouldStillWorkAsExpected() {
        List<Integer> input = List.of(10, 11, -2, 4, 6);
        List<String> expected = List.of("10", "11", "-2", "4", "6");
        List<String> result = integerListToStringListConverter.convert(input);
        Assertions.assertEquals(expected, result);
    }

}