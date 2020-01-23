package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GotDataReader {
    public List<Character> read(){
        GotDataParser gotDataParser = new GotDataParser();
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/files/got-characters.csv");
        List<Character> characters = new ArrayList<>();
        List<String> rawDataStrings;
        try {
            rawDataStrings = Files.readAllLines(path);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("read all lines failed. created empty list");
            rawDataStrings = List.of();
        }
        for (String rawDataString:rawDataStrings             ) {
            Optional<Character> character = gotDataParser.parseLine(rawDataString);
            if (character.isPresent()){
                characters.add(character.get());
            }
        }
        return characters;
    }
}
