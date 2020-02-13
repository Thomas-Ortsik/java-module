package academy.everyonecodes.java.week8.set2.exercise3;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    private static Stream<Arguments> makeDemNumbahs(){
        return Stream.of(
                Arguments.of(5.0, "10 / 2"),
                Arguments.of(3.0, "1 + 2"),
                Arguments.of(4.5, "10 - 5.5"),
                Arguments.of(20.0, "10 * 2")
                );
    }

    @ParameterizedTest
    @MethodSource ("makeDemNumbahs")

    void calculate(Double expected, String calculation ){
        Optional<Double> result = calculator.calculate(calculation);
        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }

    @Test
    void calculateShouldReturnEmptyOptional(){
        String input = "39 % 29";
        assertTrue(calculator.calculate(input).isEmpty());
    }

}