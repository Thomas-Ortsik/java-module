package academy.everyonecodes.java.week6.set2.exercise1;

import java.util.List;

public class SpecialNumbersCounter {
    public int count(int number) {
        NumberSplitter numberSplitter = new NumberSplitter();
        List<Integer> numbers = numberSplitter.split(number);
        int amountSpecialNumbers = countSpecialNumbers(numbers);
        return amountSpecialNumbers;


    }

    private int countSpecialNumbers(List<Integer> numbers) {
        List<Integer> specialNumbers = List.of(3, 6, 9);
        int amountSpecialNumbers = 0;
        for (int number : numbers
        ) {
            if (specialNumbers.contains(number)) {
                amountSpecialNumbers++;
            }

        }
        return amountSpecialNumbers;
    }
}
