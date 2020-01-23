package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DeadCharactersExtractor {

    public void extract(){
        GotDataReader gotDataReader = new GotDataReader();
        Path outputPath = Path.of("src/academy/everyonecodes/java/week5/set2/files/deaths.txt");
        List<String> deaths = new ArrayList<>();
        List<Character> characters = gotDataReader.read();
        for (Character character:characters
             ) {
            if (character.getBookOfDeath("optional").isPresent()){
                deaths.add(character.getName());
            }

        }
        try {

        Files.write(outputPath, deaths);}
        catch (IOException e){
            e.printStackTrace();
    }}
}
