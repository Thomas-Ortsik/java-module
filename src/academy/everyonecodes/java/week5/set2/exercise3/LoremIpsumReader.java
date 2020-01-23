package academy.everyonecodes.java.week5.set2.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LoremIpsumReader {
    public List<String> read(){
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt");
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return List.of("");
        }
    }
}
