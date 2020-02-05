package academy.everyonecodes.java.week7.set2.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

class FileLineAppenderTest {

    FileLineAppender fileLineAppender = new FileLineAppender();
    StreamFileReader streamFileReader = new StreamFileReader();
    String outputPath = "src/academy/everyonecodes/java/week7/set2/files/FileLineAppenderTest.txt";


    @Test
    void append() {

        String input1 = "abc";
        String input2 = "ghi";
        List<String> expected = List.of("abc", "ghi");
        fileLineAppender.append(outputPath, input1);
        fileLineAppender.append(outputPath, input2);
        List<String> result = streamFileReader.readLines(outputPath).collect(Collectors.toList());
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