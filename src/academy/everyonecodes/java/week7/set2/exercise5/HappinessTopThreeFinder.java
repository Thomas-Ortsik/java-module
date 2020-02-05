package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessTopThreeFinder {

    private HappinessDataReader reader = new HappinessDataReader();

    public List<String> findTopThree() {
        return reader.read().stream()
                .filter(this::isTopThree)
                .sorted(Comparator.comparingInt(HappinessRecord::getRank))
                //instead of the filter I could have used .limit(3) here
                //but the filter gives the same performance and looks cleaner to me
                .map(this::parse)
                .collect(Collectors.toList());
    }

    private Boolean isTopThree(HappinessRecord record) {
        return record.getRank() < 4;
    }

    private String parse(HappinessRecord record) {
        return "Country: " + record.getCountry() + " Score: " + record.getScore();
    }
}
