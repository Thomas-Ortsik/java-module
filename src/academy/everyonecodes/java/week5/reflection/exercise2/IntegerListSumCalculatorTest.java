package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListSumCalculatorTest {
    IntegerListSumCalculator integerListSumCalculator = new IntegerListSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "10, 3,4,2,1",
            "15, 7,3,5,0,",
            "-30, 100, -130, 0, 0"
    })

    void sum(int expected, int input1, int input2, int input3, int input4){
        List<Integer> input = List.of(input1,input2,input3,input4);
        int result = integerListSumCalculator.sum(input);
        Assertions.assertEquals(expected, result);
    }

}