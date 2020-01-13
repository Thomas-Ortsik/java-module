package academy.everyonecodes.java.week4.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OneToTenPickerTest {
    OneToTenPicker oneToTenPicker = new OneToTenPicker();
    @Test
    void pick() {
        List<Integer> testValues = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = oneToTenPicker.pick();
        Assertions.assertTrue(testValues.contains(result));

    }
}