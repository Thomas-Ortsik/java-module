package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListParser {
    public List<Integer> parse(String input) {
        ArrayList<Integer> intNumbers = new ArrayList<>();
        if (input.length() == 0){
            intNumbers.add(0);
            return intNumbers;
        }
        String[] stringNumbers = input.split(";");
        int size = stringNumbers.length;
        for (int i = 0; i < size; i++) {
            intNumbers.add(Integer.valueOf(stringNumbers[i]));
        }
        return intNumbers;
    }

}

