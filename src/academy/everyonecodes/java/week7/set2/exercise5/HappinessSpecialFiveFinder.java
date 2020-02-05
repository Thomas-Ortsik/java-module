package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessSpecialFiveFinder {
    private HappinessDataReader happinessDataReader = new HappinessDataReader();

    public List<String> findSpecialFive() {
        return happinessDataReader.read().stream()
                .sorted(Comparator.comparingInt(HappinessRecord::getRank).reversed())
                .filter(this::filterSpecials)
                .limit(5)
                .sorted(Comparator.comparingInt(HappinessRecord::getRank))
                .map(this::parse)
                .collect(Collectors.toList());
    }

    private boolean filterSpecials(HappinessRecord record){
        String name = record.getCountry();
        return name.contains("a") && name.length()>9;
    }

    private String parse(HappinessRecord record){
        return "Country: "+record.getCountry()+" Rank: "+record.getRank();
    }
}
