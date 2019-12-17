package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class AverageCalculator {
    public double calculateAverage(List<Integer> numbers) {
        int divisor = 0;
        double sum = 0;
        for (int number : numbers) {
            divisor++;
            sum = sum + number;
        }
        return sum / divisor;
    }
}

