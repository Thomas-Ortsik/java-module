package academy.everyonecodes.java.week5.set1.exercise3;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {

    public Optional<Double> calculate(List<Integer> numbers){
        int size = numbers.size();
        if (size==0){
            return Optional.empty();
        }
        int sum = 0;
        for (int number:numbers
             ) { sum+=number;

        }
        double average = sum/size;
        return Optional.of(average);
    }
}
