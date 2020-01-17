package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FromZeroRounderTest {
    FromZeroRounder fromZeroRounder = new FromZeroRounder();

    @ParameterizedTest
    @CsvSource({
            "3.0, 2.3",
            "-1.0, -0.4",
            "34.0, 33.6",
            "-39.0, -38.1"
    })

    void round(double expected, double input){
        double result = fromZeroRounder.round(input);
        Assertions.assertEquals(expected, result);
    }

}