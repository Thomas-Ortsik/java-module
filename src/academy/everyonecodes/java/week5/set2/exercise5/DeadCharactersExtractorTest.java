package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeadCharactersExtractorTest {
    DeadCharactersExtractor deadCharactersExtractor = new DeadCharactersExtractor();

    @Test

    void extract(){
        Path resultPath = Path.of("src/academy/everyonecodes/java/week5/set2/files/deaths.txt");
        Path expectedPath = Path.of("src/academy/everyonecodes/java/week5/set2/files/deaths_expected.txt");
        deadCharactersExtractor.extract();
        try {
            List<String> result = Files.readAllLines(resultPath);
            List<String> expected = Files.readAllLines(expectedPath);
            Assertions.assertEquals(expected, result);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}