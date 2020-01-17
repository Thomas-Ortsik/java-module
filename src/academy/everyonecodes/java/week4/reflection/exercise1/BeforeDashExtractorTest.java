package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BeforeDashExtractorTest {
    BeforeDashExtractor beforeDashExtractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "hel, hel-lo",
            "'', thisshouldreturnnothing",
            "this, this-should-only-return-one-word",
            "'', this should still return nothing",
            "just, just-be-sure"
    })

    void extract(String expected, String input){
        String result = beforeDashExtractor.extract(input);
        Assertions.assertEquals(expected, result);
    }

}