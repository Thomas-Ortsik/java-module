package academy.everyonecodes.java.week4.set2.exercise4;

import academy.everyonecodes.java.week4.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {
    public List<Double> calculate(List<Double> input) {
        DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();
        double median = doubleListMedianCalculator.calculate(input);
        ArrayList<Double> medianDifference = new ArrayList<>();
        for (Double number : input
        ) {
            medianDifference.add(number-median);

        }
        return medianDifference;
    }
}
