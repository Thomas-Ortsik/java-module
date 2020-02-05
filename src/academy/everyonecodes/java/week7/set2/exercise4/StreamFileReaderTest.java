package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamFileReaderTest {
    StreamFileReader streamFileReader = new StreamFileReader();
    FileReader fileReader = new FileReader();

    @Test
    void readReturnsAListWithEveryLineOfTheFileAsAnEntry() {
        String input = "src/academy/everyonecodes/java/week5/set2/files/document.txt";
        List<String> expected = fileReader.read(input);
        Stream<String> streamResult = streamFileReader.readLines(input);
        List<String> result = streamResult.collect(Collectors.toList());
        Assertions.assertEquals(expected, result);
    }

    @Test
    void readRootNotExistingReturnsEmptyList() {
        String input = "src/cademy/everyonecodes/java/week5/set2/files/document.txt";
        List<String> result = streamFileReader.readLines(input).collect(Collectors.toList());
        List<String> expected = List.of();
        Assertions.assertEquals(expected, result);
    }
}

