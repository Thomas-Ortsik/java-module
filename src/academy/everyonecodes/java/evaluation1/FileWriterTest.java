package academy.everyonecodes.java.evaluation1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class FileWriterTest {
    FileReader fileReader = new FileReader();
    FileWriter fileWriter = new FileWriter();
    String outputPath = "src/academy/everyonecodes/java/week5/set2/files/test.txt";

    @Test
    void write() {

        List<String> inputStrings = List.of("TestLine1", "TestLine2", "TestLine3");
        fileWriter.write(outputPath, inputStrings);
        List<String> result = fileReader.read(outputPath);
        Assertions.assertEquals(inputStrings, result);
    }


    @Test
    void append() {
        List<String> input1 = List.of("abc", "def");
        List<String> input2 = List.of("ghi");
        List<String> expected = List.of("abc", "def", "ghi");
        fileWriter.append(outputPath, input1);
        fileWriter.append(outputPath, input2);
        List<String> result = fileReader.read(outputPath);
        Assertions.assertEquals(expected, result);

    }


    @AfterEach
    void deleteTestFiles() {
        Path path = Path.of(outputPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}