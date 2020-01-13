package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListSecondHalfPicker {
    public String pick(List<String> list){
        Random random = new Random();
        int listSize = list.size();
        int secondHalfSize = listSize - (listSize/2);
        int randomIndex = random.nextInt(secondHalfSize) + listSize/2;
        return list.get(randomIndex);
    }
}
