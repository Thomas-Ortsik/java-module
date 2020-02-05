package academy.everyonecodes.java.week7.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NegativesTimesNegative2BiggerThan5Test {


    @Test
    void test() {
        List<Double> numbers = List.of(1.2, 0.4, -0.1, -2.0, -3.1, 2.0, -2.6);
        long elements = numbers.stream()
                .filter(number -> number < 0)
                .map(number -> number * -2.0)
                .filter(number -> number > 5.0)
                .count();

        int expected = 2;
        Assertions.assertEquals(expected, elements);
    }
}
