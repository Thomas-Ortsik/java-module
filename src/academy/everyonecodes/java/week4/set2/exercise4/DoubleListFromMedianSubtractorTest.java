package academy.everyonecodes.java.week4.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListFromMedianSubtractorTest {
    DoubleListFromMedianSubtractor doubleListFromMedianSubtractor = new DoubleListFromMedianSubtractor();

    @Test

    void calculateWithOnlyNegativesOdd(){
        List<Double> input = List.of(-5.0,-20.0,-10.0);
        List<Double> expected = List.of(5.0,-10.0,0.0);
        List<Double> result = doubleListFromMedianSubtractor.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void calculateWithOnlyPositivesEven(){
        List<Double> input = List.of(3.0,6.0,2.0, 1.0);
        List<Double> expected = List.of(0.5,3.5,-0.5, -1.5);
        List<Double> result = doubleListFromMedianSubtractor.calculate(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void calculateWithMixedNumbersEven(){
        List<Double> input = List.of(-14.0,20.0,4.5,-1.0);
        List<Double> expected = List.of(-15.75,18.25,2.75, -2.75);
        List<Double> result = doubleListFromMedianSubtractor.calculate(input);
        Assertions.assertEquals(expected, result);
    }

}