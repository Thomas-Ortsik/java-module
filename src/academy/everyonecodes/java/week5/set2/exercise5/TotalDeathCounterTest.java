package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TotalDeathCounterTest {
    TotalDeathCounter totalDeathCounter = new TotalDeathCounter();

    @Test

    void count(){
        Character input1 = new Character("Test", Optional.of(3), Optional.of(4));
        Character input2 = new Character("TestLong", Optional.of(5), Optional.of(8));
        Character input3 = new Character("Test", Optional.of(3), Optional.empty());
        Character input4 = new Character("TestLong", Optional.empty(), Optional.of(14));
        List<Character> input = List.of(input1, input2, input3, input4);
        int expected = 3;
        int result = totalDeathCounter.count(input);
        Assertions.assertEquals(expected,result);


    }
@Test

    void countShouldBe0(){
        Character input1 = new Character("Test", Optional.empty(), Optional.of(4));
        Character input2 = new Character("TestLong", Optional.empty(), Optional.of(8));
        Character input3 = new Character("Test", Optional.empty(), Optional.empty());
        Character input4 = new Character("TestLong", Optional.empty(), Optional.of(14));
        List<Character> input = List.of(input1, input2, input3, input4);
        int expected = 0;
        int result = totalDeathCounter.count(input);
        Assertions.assertEquals(expected,result);


    }

    @Test

    void countShouldAlsoBe0(){
        List<Character> input = List.of();
        int expected = 0;
        int result = totalDeathCounter.count(input);
        Assertions.assertEquals(expected,result);


    }

}