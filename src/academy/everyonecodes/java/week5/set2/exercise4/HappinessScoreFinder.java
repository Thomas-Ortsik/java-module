package academy.everyonecodes.java.week5.set2.exercise4;

import java.util.List;
import java.util.Optional;

public class HappinessScoreFinder {
    public Optional<Double> findFor(List<HappinessRecord> records, String country){
        for (HappinessRecord record:records
             ) {
            if (record.getCountry().equals(country))
            {
                return Optional.of(record.getScore());
            }

        } return Optional.empty();
    }
}
