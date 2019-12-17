package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        StepCollector stepCollector = new StepCollector();
        AverageCalculator averageCalculator = new AverageCalculator();
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        List<Integer> listOfSteps = stepCollector.collect();
        Double averageSteps = averageCalculator.calculateAverage(listOfSteps);
        Double distance = distanceCalculator.calculateDistanceInKilometeres(averageSteps);
        System.out.println("Average steps: " + averageSteps + "\nAverage distance: " + distance);
    }
}
