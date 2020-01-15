package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class LineSumCalculator {
    public int calculate(String input) {
        StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();
        List<Integer> numbers = stringAsIntegerListParser.parse(input);
        int addedNumbers = 0;
        for (int number : numbers) {
            addedNumbers += number;
        }
        return addedNumbers;
    }
}
