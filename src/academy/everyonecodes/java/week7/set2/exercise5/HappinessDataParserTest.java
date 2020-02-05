package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class HappinessDataParserTest {
    HappinessDataParser happinessDataParser = new HappinessDataParser();

    private static Stream<Arguments> createRecords() {
        HappinessRecord record1 = new HappinessRecord("Test", 1, 1.1);
        HappinessRecord record2 = new HappinessRecord("test2", 2, 5.1);
        HappinessRecord record3 = new HappinessRecord("test with spaces and unformatted double", 200, 1);
        return Stream.of(
                Arguments.of(record1, "Test;1;1.1;304;ldlfkr"),
                Arguments.of(record2, "test2;2;5.1;klklk;4050;rl4"),
                Arguments.of(record3, "test with spaces and unformatted double;200;1"));
    }

    @ParameterizedTest
    @MethodSource("createRecords")
    void parseLine(HappinessRecord expected, String input) {
        HappinessRecord result = happinessDataParser.parseLine(input);
        Assertions.assertEquals(expected, result);
    }

}