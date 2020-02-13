package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MultiplicationTest {
    Multiplication calculator = new Multiplication();


    @Test
    void operate() {
        double input1 = 5.0;
        double input2 = 2.5;
        double expected = 12.5;
        double result = calculator.operate(input1, input2);
        Assertions.assertEquals(expected, result);
    }


}