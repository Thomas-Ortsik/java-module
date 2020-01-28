package academy.everyonecodes.java.week6.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class NumberSplitterTest {
    NumberSplitter splitter = new NumberSplitter();

    @Test
    void split() {
        int input = 3943;
        List<Integer> expected = List.of(3, 9, 4, 3);
        List<Integer> result = splitter.split(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void splitShouldReturn0() {
        int input = 0;
        List<Integer> expected = List.of(0);
        List<Integer> result = splitter.split(input);
        Assertions.assertEquals(expected, result);
    }

}