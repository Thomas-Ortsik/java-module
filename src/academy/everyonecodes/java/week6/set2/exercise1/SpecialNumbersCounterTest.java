package academy.everyonecodes.java.week6.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpecialNumbersCounterTest {
    SpecialNumbersCounter specialNumbersCounter = new SpecialNumbersCounter();

    @ParameterizedTest
    @CsvSource({
            "3, 33091",
            "0, 0",
            "0, 21",
            "3, 369",
            "1, 46",
            "2, 692"
    })
    void count(int expected, int input) {
        int result = specialNumbersCounter.count(input);
        Assertions.assertEquals(expected, result);
    }
}