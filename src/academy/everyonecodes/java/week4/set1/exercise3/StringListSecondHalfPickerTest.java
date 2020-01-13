package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListSecondHalfPickerTest {
    StringListSecondHalfPicker stringListSecondHalfPicker = new StringListSecondHalfPicker();

    @Test
    void pick(){
        List<String> testValues = List.of("This", "is", "a", "test", "!");
        String result = stringListSecondHalfPicker.pick(testValues);
        List<String> expected = List.of("a", "test", "!");
        Assertions.assertTrue(expected.contains(result));
    }

    @Test
    void pick2(){

        List<String> testValues = List.of("This", "is", "the", "second", "test", "!");
        String result = stringListSecondHalfPicker.pick(testValues);
        List<String> expected = List.of("second", "test", "!" );
        Assertions.assertTrue(expected.contains(result));
    }

    @Test
    void pick3(){

        List<String> testValues = List.of("Test", "ok");
        String result = stringListSecondHalfPicker.pick(testValues);
        List<String> expected = List.of("ok");
        Assertions.assertTrue(expected.contains(result));
    }

}