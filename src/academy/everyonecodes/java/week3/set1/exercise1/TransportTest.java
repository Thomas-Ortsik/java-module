package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {
    Transport transport = new Transport();

    @Test
    void calculateWalkingTime() {
        double input = 1;

        double result = transport.calculateWalkingTime(input);

        double expected = 15;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateTramTime() {
        int input = 2;

        double result = transport.calculateTramTime(input);

        double expected = 8;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateTotalTime() {
        double input1 = 2;
        double input2 = 3;
        int input3 = 4;

        double result = transport.calculateTotalTime(input1, input2, input3);

        double expected = 30+45+16;
        Assertions.assertEquals(expected, result);
    }
}