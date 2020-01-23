package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineLengthReaderTest {
    LineLengthReader lineLengthReader = new LineLengthReader();

    @Test

    void read(){
        int expected = 84;
        List<Integer> result = lineLengthReader.read();
        Assertions.assertEquals(expected, result.get(59));
    }

}