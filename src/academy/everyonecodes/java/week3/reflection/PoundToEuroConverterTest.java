package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PoundToEuroConverterTest {
    PoundToEuroConverter poundToEuroConverter = new PoundToEuroConverter();

    @ParameterizedTest
    @CsvSource({
            "1, 0.85",
            "0, 0",
            "-1, -0.85",
            "2, 1.7"
    })

    void convert(double expected, double input){
        double result = poundToEuroConverter.convert(input);
        Assertions.assertEquals(expected, result);
    }
}
