package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IntCalculatorTest {
    IntCalculator intCalculator = new IntCalculator();

    @ParameterizedTest
    @CsvSource({
            "3, 1, 2",
            "0, -1, 1",
            "-1, 1, -2",
            "0, 0, 0",
    })

    void sumInt( int expected, int input1, int input2) {
        int result = intCalculator.sumInt(input1, input2);
        Assertions.assertEquals(expected, result);

    }

}