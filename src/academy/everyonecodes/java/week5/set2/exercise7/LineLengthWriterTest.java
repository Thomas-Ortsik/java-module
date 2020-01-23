package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineLengthWriterTest {
    LineLengthWriter lineLengthWriter = new LineLengthWriter();

    @Test
    void write() {
        lineLengthWriter.write();
        try {
            List<String> expected = Files.readAllLines(Path.of("src/academy/everyonecodes/java/week5/set2/files/stringlengths_expected.txt"));
            List<String> result = Files.readAllLines(Path.of("src/academy/everyonecodes/java/week5/set2/files/stringlengths.txt"));
            Assertions.assertEquals(expected, result);
        } catch (IOException e) {
            Assertions.assertTrue(false);
        }

    }

    @AfterEach
    void delete() {
        try {
            Files.delete(Path.of("src/academy/everyonecodes/java/week5/set2/files/stringlengths.txt"));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}