package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.List;

public class HappinessDataParser {

    public HappinessRecord parseLine(String line) {
        List<String> splitLine = List.of(line.split(";"));
        String country = splitLine.get(0);
        int rank = Integer.parseInt(splitLine.get(1));
        double score = Double.parseDouble(splitLine.get(2));
        return new HappinessRecord(country, rank, score);
    }
}
