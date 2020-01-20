package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinder {
    public Optional<Double> find(List<Double> numbers) {
        if (numbers.size() == 0) {
            return Optional.empty();
        }
        double lowest = numbers.get(0);
        for (double number : numbers) {
            if (number < lowest) {
                lowest = number;
            }
        }
        return Optional.of(lowest);
    }
}
