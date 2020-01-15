package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LineSumCalculatorTest {
    LineSumCalculator lineSumCalculator = new LineSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "6, 1;2;3",
            "10, 3;5;2",
            "1, 0;0;1"
    })

    void calculate(int expected, String input){
        int result = lineSumCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }
}