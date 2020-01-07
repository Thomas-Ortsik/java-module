package academy.everyonecodes.java.week3.set1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Reverser {
    public List<Integer> reverse(List<Integer> numbers){
        List<Integer> reversed = new ArrayList<>();
        for (int i=numbers.size()-1; i>=0;i--){
            reversed.add(numbers.get(i));
        }
        return reversed;
    }
}
