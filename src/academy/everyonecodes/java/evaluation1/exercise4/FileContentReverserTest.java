package academy.everyonecodes.java.evaluation1.exercise4;

import academy.everyonecodes.java.evaluation1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class FileContentReverserTest {
    FileContentReverser fileContentReverser = new FileContentReverser();
    FileReader reader = new FileReader();

    String outputPath = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed.txt";
    String inputPath = "src/academy/everyonecodes/java/evaluation1/files/lines.txt";
    String expectedPath = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed_expected.txt";

    @Test
    void reverse() {
        fileContentReverser.reverse(inputPath, outputPath);
        List<String> expected = reader.read(expectedPath);
        List<String> result = reader.read(outputPath);
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void delete() {
        try {
            Files.delete(Path.of(outputPath));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}