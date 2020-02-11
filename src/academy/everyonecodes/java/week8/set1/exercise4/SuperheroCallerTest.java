package academy.everyonecodes.java.week8.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class SuperheroCallerTest {
    SuperheroCaller caller = new SuperheroCaller();


    private static Stream<Arguments> superheroCreator() {
        Superhero batman = new Batman();
        Superhero spiderman = new Spiderman();
        Superhero superman = new Superman();
        return Stream.of(
                Arguments.of(batman, "Wayne"),
                Arguments.of(superman, "Kent"),
                Arguments.of(spiderman, "Parker"),
                Arguments.of(batman, "Bruce"),
                Arguments.of(superman, "Clark"),
                Arguments.of(spiderman, "Peter"),
                Arguments.of(batman, "Batman"),
                Arguments.of(superman, "Superman"),
                Arguments.of(spiderman, "Spiderman"));
    }

    @ParameterizedTest
    @MethodSource("superheroCreator")
    void findSuperhero(Superhero expected, String input) {
        Optional<Superhero> oResult = caller.findSuperhero(input);
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test

    void findSuperheroShouldReturnEmptyOptional(){
        String input = "Captain";
        Optional<Superhero> result = caller.findSuperhero(input);
        Assertions.assertTrue(result.isEmpty());
    }

}