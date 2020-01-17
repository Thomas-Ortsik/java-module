package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxOrMinPickerTest {
    MaxOrMinPicker maxOrMinPicker = new MaxOrMinPicker();

    @Test

    void pickEmptyListShouldReturnRandomInteger(){
        List<Integer> input = List.of();
        int result = maxOrMinPicker.pick(input);
        Assertions.assertTrue(result <= 0 || result >= 0);
    }

    @Test

    void pickOneValue(){
        List<Integer> input = List.of(4);
        int expected = 4;
        int result = maxOrMinPicker.pick(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void pickFullList(){
        List<Integer> input = List.of(4, 8, 2, 75, 1);
        List<Integer> expected = List.of(1, 75);
        int result = maxOrMinPicker.pick(input);
        Assertions.assertTrue(expected.contains(result));
    }


}