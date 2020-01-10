package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValueCalculatorTest {
    AbsoluteValueCalculator absoluteValueCalculator = new AbsoluteValueCalculator();

    @ParameterizedTest
    @CsvSource({
            "4, -4",
            "23, -23",
            "3, 3",
            "0.5, -0.5",
            "0.5, 0.5"
    })
    void calculate(double expected, double input){
        double result = absoluteValueCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }
}