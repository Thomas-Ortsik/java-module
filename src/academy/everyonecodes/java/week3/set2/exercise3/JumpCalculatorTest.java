package academy.everyonecodes.java.week3.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class JumpCalculatorTest {
    JumpCalculator jumpCalculator = new JumpCalculator();

    @ParameterizedTest
    @CsvSource({
            "6, 1",
            "0, 0"
    })

    void calculate(int expected, int input){
        int result = jumpCalculator.calculate(input);        Assertions.assertEquals(expected, result);

    }
}
