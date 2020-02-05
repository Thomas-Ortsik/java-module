package academy.everyonecodes.java.week7.set2.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileLineAppender {
    public void append(String pathString, String textToAppend) {
        Path path = Path.of(pathString);

        try {
            if (Files.exists(path)) {
                Files.writeString(path, "\n" + textToAppend, StandardOpenOption.APPEND);
            } else {
                Files.writeString(path, textToAppend, StandardOpenOption.CREATE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
