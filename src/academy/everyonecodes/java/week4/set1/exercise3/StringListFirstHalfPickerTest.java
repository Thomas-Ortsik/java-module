package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListFirstHalfPickerTest {
    StringListFirstHalfPicker stringListFirstHalfPicker = new StringListFirstHalfPicker();

    @Test
    void pick(){

        List<String> testValues = List.of("This", "is", "a", "test", "!");
        String result = stringListFirstHalfPicker.pick(testValues);
        List<String> expected = List.of("is", "This");
        Assertions.assertTrue(expected.contains(result));
    }

    @Test
    void pick2(){

        List<String> testValues = List.of("This", "is", "the", "second", "test", "!");
        String result = stringListFirstHalfPicker.pick(testValues);
        List<String> expected = List.of("is", "This", "the");
        Assertions.assertTrue(expected.contains(result));
    }

    @Test
    void pick3(){

        List<String> testValues = List.of("Test", "ok");
        String result = stringListFirstHalfPicker.pick(testValues);
        List<String> expected = List.of("Test");
        Assertions.assertTrue(expected.contains(result));
    }

}