package academy.everyonecodes.java.week6.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DigitSumCalculatorTest {
    DigitSumCalculator digitSumCalculator = new DigitSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "19 ,2593",
            "0, 0",
            "1, 10000",
    })
    void calculate(int exptected, int input) {
        int result = digitSumCalculator.calculate(input);
        Assertions.assertEquals(exptected, result);
    }

}