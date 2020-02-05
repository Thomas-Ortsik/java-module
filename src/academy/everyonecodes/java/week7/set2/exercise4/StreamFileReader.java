package academy.everyonecodes.java.week7.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamFileReader {

    public Stream<String> readLines(String pathString) {
        Path path = Path.of(pathString);
        try {
            return Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return Stream.empty();
        }
    }
}
