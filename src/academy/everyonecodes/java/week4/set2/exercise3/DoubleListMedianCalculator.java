package academy.everyonecodes.java.week4.set2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {
    public double calculate(List<Double> originalInput){
        ArrayList<Double> input = new ArrayList<>(originalInput);
        Collections.sort(input);
        double listSize = input.size();
        boolean sizeIsEven = listSize%2==0;
        if (sizeIsEven){
            int index1 = (int)listSize/2;
            int index0 = index1-1;
            double median = (input.get(index0) + input.get(index1))/2;
            return median;
        }

        return input.get((int)listSize/2);
    }
}
