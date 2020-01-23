package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LongestNameFinderTest {
    LongestNameFinder longestNameFinder = new LongestNameFinder();

    @Test

    void find(){
        Character input1 = new Character("Test", Optional.of(3), Optional.of(4));
        Character input2 = new Character("TestLong", Optional.of(13), Optional.of(14));
        List<Character> input = List.of(input1, input2);
        Character expected = input2;
        Character result = longestNameFinder.find(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findAgain(){
        Character input1 = new Character("TestLONGER", Optional.of(3), Optional.of(4));
        Character input2 = new Character("TestLong", Optional.of(13), Optional.of(14));
        List<Character> input = List.of(input1, input2);
        Character expected = input1;
        Character result = longestNameFinder.find(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findAndAgain(){
        Character input1 = new Character("TestLong", Optional.of(3), Optional.of(4));
        Character input2 = new Character("TestLong", Optional.of(13), Optional.of(14));
        List<Character> input = List.of(input1, input2);
        Character expected = input1;
        Character result = longestNameFinder.find(input);
        Assertions.assertEquals(expected, result);
    }
}