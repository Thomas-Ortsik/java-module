package academy.everyonecodes.java.week5.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMaximumFinderTest {
    DoubleListMaximumFinder doubleListMaximumFinder = new DoubleListMaximumFinder();

    @Test

    void findShouldReturnEmptyOptional(){
        List<Double> input = List.of();
        Optional<Double> expected = Optional.empty();
        Optional<Double> result = doubleListMaximumFinder.find(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findShouldReturn30(){
        List<Double> input = List.of(30.0, 2.4, 21.0, -87.0);
        Optional<Double> expected = Optional.of(30.0);
        Optional<Double> result = doubleListMaximumFinder.find(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findShouldReturn20Point4(){
        List<Double> input = List.of(1.5, 20.4, 4.0);
        Optional<Double> expected = Optional.of(20.4);
        Optional<Double> result = doubleListMaximumFinder.find(input);
        Assertions.assertEquals(expected, result);
    }

}