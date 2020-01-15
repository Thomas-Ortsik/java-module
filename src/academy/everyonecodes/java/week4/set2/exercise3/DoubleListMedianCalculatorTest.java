package academy.everyonecodes.java.week4.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMedianCalculatorTest {
    DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();


    @Test
    void calculateShouldReturnAverageWithOnlyTwoValuesInList() {
        List<Double> input = List.of(10.0, 0.0);
        double expected = 5.0;
        double result = doubleListMedianCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateShoudReturnMidValueWithAnUnevenNumberOfValues() {
        List<Double> input = List.of(394.03, 0.0, 3947763.00, 20.5, 3.0);
        double expected = 20.5;
        double result = doubleListMedianCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void calculateShouldReturnOnlyValueInList() {
        List<Double> input = List.of(5.5);
        double expected = 5.5;
        double result = doubleListMedianCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateShouldReturnAverageOfTwoMiddleValuesWithAnEvenNumberOfValues() {
        List<Double> input = List.of(10.0, 2.5, 1.0, 3.5);
        double expected = 3.0;
        double result = doubleListMedianCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }


}