package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.List;

public class IntegerListSumCalculator {

    public int sum(List<Integer> listOfInt){
        int sum = 0;
        for (int number:listOfInt
        ) {
            sum += number;
        }return sum;
    }
}
