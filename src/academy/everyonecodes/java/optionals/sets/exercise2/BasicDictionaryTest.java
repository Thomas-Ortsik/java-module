package academy.everyonecodes.java.optionals.sets.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class BasicDictionaryTest {
    BasicDictionary dictionary = new BasicDictionary();

    static Stream<Arguments> listMaker() {
        return Stream.of(
                Arguments.of(List.of("the", "elegant", "jumped","up"), "The elegant cat jumped up the table"),
                Arguments.of(List.of(), "table Hi house dOg cat CHAIR elephant")
        );
    }

    @ParameterizedTest
    @MethodSource("listMaker")

    void findUnknownWords(List<String> expected, String input){
        List<String> result = dictionary.findUnknownWords(input);
        Assertions.assertEquals(expected, result);
    }
}