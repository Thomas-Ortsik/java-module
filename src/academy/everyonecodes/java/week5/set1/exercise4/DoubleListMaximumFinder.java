package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinder {
    public Optional<Double> find(List<Double> numbers) {
        if (numbers.size() == 0) {
            return Optional.empty();
        }
        double highest = numbers.get(0);
        for (double number : numbers) {
            if (number > highest) {
                highest = number;
            }
        }
        return Optional.of(highest);
    }
}