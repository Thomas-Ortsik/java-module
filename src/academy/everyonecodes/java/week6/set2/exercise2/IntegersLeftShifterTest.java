package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntegersLeftShifterTest {
    IntegersLeftShifter integersLeftShifter = new IntegersLeftShifter();


    @Test
    void shiftOne() {
        List<Integer> input = List.of(0, 1, 2, 3, 4);
        List<Integer> expected = List.of(1, 2, 3, 4, 0);
        List<Integer> result = integersLeftShifter.shiftOne(input);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void shiftOneWithNoValues() {
        List<Integer> input = List.of();
        List<Integer> expected = List.of();
        List<Integer> result = integersLeftShifter.shiftOne(input);
        Assertions.assertEquals(expected, result);
    }


    @Test
    void shiftOneWithOneValue() {
        List<Integer> input = List.of(4);
        List<Integer> expected = List.of(4);
        List<Integer> result = integersLeftShifter.shiftOne(input);
        Assertions.assertEquals(expected, result);
    }

}