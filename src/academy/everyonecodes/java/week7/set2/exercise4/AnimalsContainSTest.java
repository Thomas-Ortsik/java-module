package academy.everyonecodes.java.week7.set2.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalsContainSTest {
    StreamFileReader streamFileReader = new StreamFileReader();
    FileLineAppender fileLineAppender = new FileLineAppender();
    String output = "src/academy/everyonecodes/java/week7/set2/files/animals-s.txt";

    @Test
    void test() {

        String expectedPath = "src/academy/everyonecodes/java/week7/set2/files/animals-s_expected.txt";
        Stream<String> animals = streamFileReader.readLines("src/academy/everyonecodes/java/week7/set2/files/animals.txt");
        animals.filter(animal -> animal.contains("s") || animal.contains("S"))
                .map(String::toUpperCase)
                .forEach(animal -> fileLineAppender.append(output, animal));

        List<String> expected = streamFileReader.readLines(expectedPath).collect(Collectors.toList());
        List<String> result = streamFileReader.readLines(output).collect(Collectors.toList());
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void deleteTestFiles() {
        Path path = Path.of(output);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}