package academy.everyonecodes.java.week6.set2.exercise2;

import academy.everyonecodes.java.week5.set1.exercise4.DoubleListMinimumFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DoublesRightShifterTest {
    DoublesRightShifter doublesRightShifter = new DoublesRightShifter();

    @Test
    void shiftTwo() {
        List<Double> input = List.of(2.1, 1.0, 3.5);
        List<Double> expected = List.of(1.0, 3.5, 2.1);
        List<Double> result = doublesRightShifter.shiftTwo(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shiftTwoWithOneNumber() {
        List<Double> input = List.of(2.1);
        List<Double> expected = List.of(2.1);
        List<Double> result = doublesRightShifter.shiftTwo(input);
        Assertions.assertEquals(expected, result);
    }

}