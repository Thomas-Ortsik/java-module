package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {
    Knife knife = new Knife();

    @Test

    void getName(){
        String result = knife.getName();
        assertEquals("Knife", result);
    }

    @ParameterizedTest
    @CsvSource({
            "true, fish",
            "true, Pizza",
            "true, Fish",
            "true, piZZa",
            "false, Soup"
    })

    void isUsedFor(boolean expected, String dish){
        boolean result = knife.isUsedFor(dish);
        assertEquals(expected, result);
    }

}