package academy.everyonecodes.java.week10.set1.exercise1.cards;

import academy.everyonecodes.java.week10.set1.exercise1.cards.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidatorTest {
    Validator validator = new Validator();

    @ParameterizedTest
    @CsvSource({
            "true, 378282246310005",
            "false, 378282446310005"
    })

    void isValid(boolean expected, long input){
        boolean result = validator.isValid(input);
        Assertions.assertEquals(expected, result);
    }

}