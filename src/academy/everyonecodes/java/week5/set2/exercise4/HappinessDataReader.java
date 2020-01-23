package academy.everyonecodes.java.week5.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {
    public List<HappinessRecord> read() {
        FileReader fileReader = new FileReader();
        HappinessDataParser happinessDataParser = new HappinessDataParser();
        String fileLocation = "src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv";
        List<String> rawInput = fileReader.read(fileLocation);
        List<HappinessRecord> happinessRecords = new ArrayList<>();

        //since the first line in our CSV is not an actual entry, it will throw one "INVALID ENTRY"
        //into the collection. I originally had a boolean check for if it's the first line,
        //but i guess we can't always be sure if the first line is not an actual entry, so i removed it.
        //in theory, you could filter out "INVALID ENTRY" results before showing them to the user
        for (String input : rawInput) {
            Optional<HappinessRecord> oRecord = happinessDataParser.parseLine(input);
            happinessRecords.add(oRecord.orElse(new HappinessRecord("INVALID ENTRY", -1, 0.00)));
        }
        return happinessRecords;
    }
}
