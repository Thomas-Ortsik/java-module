package academy.everyonecodes.java.week5.set2.exercise4;

import java.util.Optional;

public class HappinessDataParser {
    public Optional<HappinessRecord> parseLine(String entry) {
        String[] splitInput = entry.split(";");
        if (splitInput.length<3){return Optional.empty();}
        try {

            return Optional.of(new HappinessRecord(splitInput[0], Integer.parseInt(splitInput[1]), Double.parseDouble(splitInput[2])));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}