package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VowelCounterTest {
    VowelCounter vowelCounter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "5, aeiou",
            "3, hello world",
            "0, prrrbprrrb",
            "0, ''",
            "5, AEIOU"
    })
    void count(int expected, String input) {
        int result = vowelCounter.count(input);
        Assertions.assertEquals(expected, result);
    }

}