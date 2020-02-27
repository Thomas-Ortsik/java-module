package academy.everyonecodes.java.evaluation2.exercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class NumberNameShifterTest {
    NumberNameShifter numberNameShifter = new NumberNameShifter();

    static Stream<Arguments> listMaker() {
        return Stream.of(
                Arguments.of(List.of("one", "three", "four", "nine"), List.of("two", "four", "five")),
                Arguments.of(List.of("one", "ten", "minus one"), List.of("two")),
                Arguments.of(List.of(), List.of()));
    }

    @ParameterizedTest
    @MethodSource("listMaker")

    void shift(List<String> input, List<String> expected){
        List<String> result = numberNameShifter.shift(input);
        Assertions.assertEquals(expected, result);
    }
}