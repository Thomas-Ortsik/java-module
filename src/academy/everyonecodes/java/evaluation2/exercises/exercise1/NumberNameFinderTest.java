package academy.everyonecodes.java.evaluation2.exercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class NumberNameFinderTest {
    NumberNameFinder nameFinder = new NumberNameFinder();

    static Stream<Arguments> listMaker() {
        return Stream.of(
                Arguments.of(List.of("one", "three", "zero", "nine"), "ZERO"),
                Arguments.of(List.of("one", "three", "ten"), "THREE"),
                Arguments.of(List.of("four"),"FOUR"),
                Arguments.of(List.of(), ""));
    }

    @ParameterizedTest
    @MethodSource("listMaker")

    void find(List<String> input, String expected){
        String result = nameFinder.find(input);
        Assertions.assertEquals(expected, result);
    }

}