package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MileToKilometerConverterTest {
    MileToKilometerConverter mileToKilometerConverter = new MileToKilometerConverter();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 0.6213712"
    })

    void convert(double expected, double input){
        double result = mileToKilometerConverter.convert(input);
        Assertions.assertEquals(expected, result);

    }

}