package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCalculatorTest {
    DoubleCalculator doubleCalculator = new DoubleCalculator();

    @ParameterizedTest
    @CsvSource({
            "2.5, 1, 1.5",
            "-2, 1.5, -3.5",
            "1, -2, 3"
    })

    void sumDouble(double expected, double input1, double input2){
        double result = doubleCalculator.sumDouble(input1, input2);
        Assertions.assertEquals(expected, result);

    }

}