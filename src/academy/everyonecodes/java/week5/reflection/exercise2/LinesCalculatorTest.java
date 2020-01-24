package academy.everyonecodes.java.week5.reflection.exercise2;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinesCalculatorTest {
    LinesCalculator linesCalculator = new LinesCalculator();


    @Test

    void calculate(){
        List<String> input = List.of("4;3;5;1", "9;4;2;5");
        List<Integer> expected = List.of(13,20);
        List<Integer> result = linesCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }


    @Test

    void calculateWithEmptyList(){
        List<String> input = List.of();
        List<Integer> expected = List.of();
        List<Integer> result = linesCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }


    @Test

    void calculateShouldReturn0onFirstItem(){
        List<String> input = List.of("4;3;oijk;1", "10;4;2;5");
        List<Integer> expected = List.of(0, 21);
        List<Integer> result = linesCalculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }
}