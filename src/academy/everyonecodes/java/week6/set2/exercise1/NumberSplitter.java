package academy.everyonecodes.java.week6.set2.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberSplitter {
    public List<Integer> split(int number) {
        List<Integer> numbers = new ArrayList<>();
        if (number == 0) {
            numbers.add(0);
        } else {
            while (number > 0) {
                int digit = number % 10;
                number = number / 10;
                numbers.add(digit);
            }
            Collections.reverse(numbers);   //not really needed for our exercises. But hey, static method training.
        }
        return numbers;
    }
}
