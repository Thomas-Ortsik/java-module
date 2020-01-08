package academy.everyonecodes.java.week3.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {
    PowerCalculator powerCalculator = new PowerCalculator();

    @ParameterizedTest
    @CsvSource({
            "4, 2, 2",
            "1, 1, 4",
            "1024, 4, 5",
            "1, 1, 0",
            "0.25, 0.5, 2"
    })

    void calculate(double expected, double input1, double input2){
        double result = powerCalculator.calculate(input1, input2);
        Assertions.assertEquals(expected, result);

    }

}