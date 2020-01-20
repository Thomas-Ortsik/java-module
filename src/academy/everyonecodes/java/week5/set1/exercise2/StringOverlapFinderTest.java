package academy.everyonecodes.java.week5.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;


class StringOverlapFinderTest {
    StringOverlapFinder stringOverlapFinder = new StringOverlapFinder();

    @Test

    void findShouldReturnEl(){
        String inputOne = "michael";
        String inputTwo = "elias";
        Optional<String> expected = Optional.of("el");
        Optional<String> result = stringOverlapFinder.find(inputOne,inputTwo);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findShouldReturnGacki(){
        String inputOne = "Gacki";
        String inputTwo = "SowasVonGacki";
        Optional<String> expected = Optional.of("gacki");
        Optional<String> result = stringOverlapFinder.find(inputOne,inputTwo);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findShouldReturnEmptyOptional(){
        String inputOne = "michael";
        String inputTwo = "Gacki";
        Optional<String> expected = Optional.empty();
        Optional<String> result = stringOverlapFinder.find(inputOne,inputTwo);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findShouldReturnTheLongerOverlap(){
        String inputOne = "LeTest";
        String inputTwo = "TestLe";
        Optional<String> expected = Optional.of("test");
        Optional<String> result = stringOverlapFinder.find(inputTwo,inputOne);
        Assertions.assertEquals(expected, result);
    }

}