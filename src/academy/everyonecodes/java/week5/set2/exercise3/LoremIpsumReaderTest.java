package academy.everyonecodes.java.week5.set2.exercise3;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoremIpsumReaderTest {
    LoremIpsumReader loremIpsumReader = new LoremIpsumReader();
    FileReader fileReader = new FileReader();


    @Test

    void read(){
        List<String> expected = fileReader.read("src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt");
        List<String> result = loremIpsumReader.read();
        Assertions.assertEquals(expected, result);
    }

    @Test

    void readTestWithHardcodedExpected(){
        List<String> expected = List.of(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        List<String> result = loremIpsumReader.read();
        Assertions.assertEquals(expected, result);
    }

}