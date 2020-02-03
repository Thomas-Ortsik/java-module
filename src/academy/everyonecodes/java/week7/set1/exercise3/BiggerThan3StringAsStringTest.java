package academy.everyonecodes.java.week7.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class BiggerThan3StringAsStringTest {
    List<String> test() {
        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5);
        List<String> transformedNumbers = numbers.stream()
                .filter(number -> number > 3)
                .map(number -> String.valueOf(number))
                .collect(Collectors.toList());
        return transformedNumbers;
    }

    @Test
    void testOfTest() {
        List<String> expected = List.of("4", "5");
        List<String> result = test();
        Assertions.assertEquals(expected, result);
    }
}
