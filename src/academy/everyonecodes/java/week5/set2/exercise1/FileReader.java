package academy.everyonecodes.java.week5.set2.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileReader {
    public List<String> read(String filePath){
        Path path = Path.of(filePath);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return lines;

    }
}
