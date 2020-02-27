package academy.everyonecodes.java.evaluation2.exercises.exercise1;

import java.util.Comparator;
import java.util.List;

public class NumberNameFinder {
    private NumberNamesDictionary dictionary = new NumberNamesDictionary();

    public String find(List<String> input) {
        return input.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .findFirst().orElse("");
    }
}
