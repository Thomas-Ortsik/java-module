package academy.everyonecodes.java.week5.set2.exercise7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LineLengthReader {
    public List<Integer> read() {
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/files/strings.txt");
        List<String> strings;
        try {
            strings = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
        List<Integer> integers = new ArrayList<>();
        for (String string : strings
        ) {
            integers.add(string.length());

        }
        return integers;
    }
}
