package academy.everyonecodes.java.optionals.maps.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringToLengthMapperTest {
    StringToLengthMapper mapper = new StringToLengthMapper();

    static Stream<Arguments> mapMaker(){
        return Stream.of(
                Arguments.of(Map.of("hi", 2, "there", 5), List.of("hi", "there")),
                Arguments.of(Map.of("", 0, "boom", 4, "bang",4), List.of("", "boom", "bang")),
                Arguments.of(Map.of(), List.of())
                );
    }
    @ParameterizedTest
    @MethodSource ("mapMaker")

    void map(Map<String, Integer> expected, List<String> input){
        Map<String, Integer> result = mapper.map(input);
        Assertions.assertEquals(expected, result);
    }
}