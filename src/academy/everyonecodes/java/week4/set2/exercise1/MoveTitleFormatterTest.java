package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MoveTitleFormatterTest {
    MoveTitleFormatter moveTitleFormatter = new MoveTitleFormatter();

    @ParameterizedTest
    @CsvSource({
            "Test Aloha Hooray, test aloha hooray",
            "Test Aloha Hooray, ' Test aloha hooray'",
            "Test Aloha Hooray, TEST ALOHA HOORAY"
    })

    void format(String expected, String input){
        String result = moveTitleFormatter.format(input);
        Assertions.assertEquals(expected, result);
    }

}