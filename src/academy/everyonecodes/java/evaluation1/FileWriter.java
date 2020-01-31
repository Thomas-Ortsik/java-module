package academy.everyonecodes.java.evaluation1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWriter {
    public void write(String outputPath, List<String> textToWrite) {
        Path path = Path.of(outputPath);
        try {
            Files.write(path, textToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void append(String outputPath, List<String> textToAdd) {
        Path path = Path.of(outputPath);

        try {
            if (Files.exists(path)) {
                Files.write(path, textToAdd, StandardOpenOption.APPEND);
            } else {
                Files.write(path, textToAdd, StandardOpenOption.CREATE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

