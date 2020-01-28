package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoublesRightShifter {
    public List<Double> shiftTwo(List<Double> numbers) {
        try {
            Collections.rotate(numbers, 2);
            return numbers;
        } catch (UnsupportedOperationException e) {    //messing around with micro-optimization, i guess
            List<Double> mutableList = new ArrayList<>(numbers);
            Collections.rotate(mutableList, 2);
            return mutableList;
        }
    }
}
