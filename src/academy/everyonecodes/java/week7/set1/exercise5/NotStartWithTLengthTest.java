package academy.everyonecodes.java.week7.set1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotStartWithTLengthTest {



    Stream<String> words = Stream.of("Hello", "there", "General", "Kenobi");
    List<Integer> wordLengths = words.filter(word -> !word.startsWith("t"))
            .map(word -> word.length())
            .collect(Collectors.toList());

    @Test

    void actualTest(){
        List<Integer> expected = List.of(5, 7, 6);
        Assertions.assertEquals(expected, wordLengths);
    }
}
