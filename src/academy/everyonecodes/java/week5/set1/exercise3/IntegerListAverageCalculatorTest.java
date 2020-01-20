package academy.everyonecodes.java.week5.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListAverageCalculatorTest {
    IntegerListAverageCalculator integerListAverageCalculator = new IntegerListAverageCalculator();

    @Test

    void calculateEmptyListShouldReturnEmptyOptional(){
        List<Integer> input = List.of();
        Optional<Double> expected = Optional.empty();
        Optional<Double> result = integerListAverageCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void calculateShouldReturn3(){
        List<Integer> input = List.of(2, 4);
        Optional<Double> expected = Optional.of(3.0);
        Optional<Double> result = integerListAverageCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void calculateShouldReturn10(){
        List<Integer> input = List.of(6, 4, 20);
        Optional<Double> expected = Optional.of(10.0);
        Optional<Double> result = integerListAverageCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

}