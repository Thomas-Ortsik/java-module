package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ForkTest {
    Fork fork = new Fork();

    @Test
     void getName(){
        String result = fork.getName();
        assertEquals("Fork", result);
    }

    @ParameterizedTest
    @CsvSource({
            "true, Fish",
            "true, Pizza",
            "true, Pasta",
            "true, pasTa",
            "false, Soup"
    })

    void isUsedFor(boolean expected, String dish){
        boolean result = fork.isUsedFor(dish);
        assertEquals(expected, result);
    }

}