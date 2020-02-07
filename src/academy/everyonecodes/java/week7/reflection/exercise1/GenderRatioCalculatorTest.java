package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderRatioCalculatorTest {
    GenderRatioCalculator calculator = new GenderRatioCalculator();

    @Test

    void calculate(){
        String expected = "518:482";
        String result = calculator.calculate();
        assertEquals(expected, result);
    }

}