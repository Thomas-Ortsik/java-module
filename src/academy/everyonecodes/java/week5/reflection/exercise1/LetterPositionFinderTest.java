package academy.everyonecodes.java.week5.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LetterPositionFinderTest {
    LetterPositionFinder letterPositionFinder = new LetterPositionFinder();

    @ParameterizedTest
    @CsvSource({
            "2, test, s",
            "3, damn, n",
            "0, Iguessletsdoareallylongwordtoo, i"
    })

    void findShouldReturnValues(int expected, String word, String letter){
        Optional<Integer> oResult = letterPositionFinder.find(word, letter);
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test

    void findShouldReturnEmptyOptional(){
        String word = "bamboozled";
        String letter = "y";
        Optional<Integer> oResult = letterPositionFinder.find(word, letter);
        Assertions.assertTrue(oResult.isEmpty());
    }

}