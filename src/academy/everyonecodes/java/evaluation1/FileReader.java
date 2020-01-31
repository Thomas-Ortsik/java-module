package academy.everyonecodes.java.evaluation1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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
