package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.stream.Collectors;

public class HappinessDataReader {
    private StreamFileReader streamFileReader = new StreamFileReader();
    private HappinessDataParser parser = new HappinessDataParser();

    public List<HappinessRecord> read() {
        String path = "src/academy/everyonecodes/java/week7/set2/files/world-happiness-2017.csv";
        return streamFileReader.readLines(path)
                .skip(1)
                .map(entry -> parser.parseLine(entry))
                .collect(Collectors.toList());
    }


}
