package academy.everyonecodes.java.week3.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DivisionCalculatorTest {
    DivisionCalculator divisionCalculator = new DivisionCalculator();
    @ParameterizedTest
    @CsvSource({
            "1, 1, 1",
            "3, 6, 2",
            "6, 18, 3",
            "0.5, 1, 2"
    })

    void divide(double expected, double input1, double input2){
        double result = divisionCalculator.divide(input1, input2);
        Assertions.assertEquals(expected, result);

    }
}
