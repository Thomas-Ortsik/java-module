package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

class FirstVowelFinderTest {
    FirstVowelFinder firstVowelFinder = new FirstVowelFinder();

    @ParameterizedTest
    @CsvSource({
            "e, Hello world",
            "A, Alloha",
            "u, dune"
    })
    void find(String expected, String input) {
        Optional<String> oResult = firstVowelFinder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        String result = oResult.get();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void findReturnsEmptyOptional() {
        String input = "NFL";
        Optional<String> oResult = firstVowelFinder.find(input);
        Assertions.assertTrue(oResult.isEmpty());
    }
}