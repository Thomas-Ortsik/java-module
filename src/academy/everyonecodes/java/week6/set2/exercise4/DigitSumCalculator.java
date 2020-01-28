package academy.everyonecodes.java.week6.set2.exercise4;

import academy.everyonecodes.java.week6.set2.exercise1.NumberSplitter;

import java.util.List;

public class DigitSumCalculator {
    NumberSplitter numberSplitter = new NumberSplitter();

    public int calculate(int number) {
        List<Integer> splitNumber = numberSplitter.split(number);
        int sum = 0;
        for (int digit : splitNumber
        ) {
            sum = sum + digit;

        }
        return sum;
    }
}
