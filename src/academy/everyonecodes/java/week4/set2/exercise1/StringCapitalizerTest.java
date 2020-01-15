package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCapitalizerTest {
    StringCapitalizer stringCapitalizer = new StringCapitalizer();

    @ParameterizedTest
    @CsvSource({
            "Test, test",
            "Test test, test test",
            "Test, ' test '",
            "Test, TEST"
    })

    void capitalize(String expected, String input){
        String result = stringCapitalizer.capitalize(input);
        Assertions.assertEquals(expected, result);
    }



}