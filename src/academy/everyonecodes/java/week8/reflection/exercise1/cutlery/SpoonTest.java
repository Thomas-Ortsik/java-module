package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SpoonTest {
    Spoon spoon = new Spoon();

    @Test

    void getName(){
        String result = spoon.getName();
        assertEquals("Spoon", result);
    }

    @ParameterizedTest
    @CsvSource({
            "true, Soup",
            "true, soup",
            "false, Fish"
    })

    void isUsedFor(boolean expected, String dish){
        boolean result = spoon.isUsedFor(dish);
        assertEquals(expected, result);
    }

}