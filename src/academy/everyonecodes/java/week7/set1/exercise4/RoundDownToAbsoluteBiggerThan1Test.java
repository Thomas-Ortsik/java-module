package academy.everyonecodes.java.week7.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class RoundDownToAbsoluteBiggerThan1Test {

    @Test
    void test(){
        Stream<Double> inputs = Stream.of(1.5, -1.8, 3.5);
        Optional<Double> oResult = inputs.map(number -> Math.floor(number))
                .map(number -> Math.abs(number))
                .filter(number -> number > 1)
                .findFirst();
        Assertions.assertTrue(oResult.isPresent());
        Double result = oResult.get();

    }
}
