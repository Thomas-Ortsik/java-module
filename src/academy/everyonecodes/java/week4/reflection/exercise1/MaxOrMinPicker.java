package academy.everyonecodes.java.week4.reflection.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxOrMinPicker {
    public int pick(List<Integer> numbers) {
        Random random = new Random();
        ArrayList<Integer> numbersArrayList = new ArrayList<>(numbers);
        Collections.sort(numbersArrayList);
        int size = numbersArrayList.size();
        boolean pickHigh = Math.random() < 0.5;
        if (size == 0){
            return random.nextInt();
        }
        if (pickHigh){
            return numbersArrayList.get(size-1);
        }
        return numbersArrayList.get(0);
    }
}
