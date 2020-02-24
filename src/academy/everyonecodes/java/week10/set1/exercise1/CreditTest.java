package academy.everyonecodes.java.week10.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CreditTest {
    Credit credit = new Credit();

    @ParameterizedTest
    @CsvSource({
            "AMERICAN EXPRESS, 378282246310005",
            "AMERICAN EXPRESS, 371449635398431",
            "MASTERCARD, 2221000000000009",
            "MASTERCARD, 2223016768739313",
            "MASTERCARD, 2223000048400011",
            "VISA, 4111111111111111",
            "VISA, 4012888888881881",
            "VISA, 4222222222222",
            "INVALID, 4",
            "INVALID, 378272246310005",
            "INVALID, 4111111121111111"
    })
    void evaluate(String expected, long input) {
        String result = credit.evaluate(input);
        Assertions.assertEquals(expected, result);
    }

}