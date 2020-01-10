package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListSumCalculatorTest {
    DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();






    @Test

    void calculateCase1() {
        List<Double> input = List.of(5.0,3.0,2.0);
        double expected1 = 10;
        double result = doubleListSumCalculator.calculate(input);
        Assertions.assertEquals(expected1, result);
    }
    @Test
    void calculateCase2() {
        List<Double> input = List.of(0.0,0.0,1.0);
        double expected2 = 1;
        double result = doubleListSumCalculator.calculate(input);
        Assertions.assertEquals(expected2, result);
    }
    @Test
    void calculateCase3(){
        List<Double> input = List.of(10.5,9.5);
        double expected3 = 20;
        double result = doubleListSumCalculator.calculate(input);
        Assertions.assertEquals(expected3, result);
    }

}