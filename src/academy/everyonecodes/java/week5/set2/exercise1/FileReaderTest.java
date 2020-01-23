package academy.everyonecodes.java.week5.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {
    FileReader fileReader = new FileReader();

    @Test

    void readReturnsAListWithEveryLineOfTheFileAsAnEntry(){
        String input = "src/academy/everyonecodes/java/week5/set2/files/document.txt";
        List<String> expected = List.of("line 1;part 1-2", "line 2;part 2-2", "line 3;part 3-2");
        List<String> result = fileReader.read(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void readRootNotExistingReturnsEmptyList(){
        String input = "src/cademy/everyonecodes/java/week5/set2/files/document.txt";
        List<String> expected = List.of();
        List<String> result = fileReader.read(input);
        Assertions.assertEquals(expected, result);
    }

}