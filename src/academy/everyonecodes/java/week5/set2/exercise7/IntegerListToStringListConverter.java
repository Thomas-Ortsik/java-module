package academy.everyonecodes.java.week5.set2.exercise7;

import java.util.ArrayList;
import java.util.List;

public class IntegerListToStringListConverter {
    public List<String> convert(List<Integer> integers){
        List<String> strings = new ArrayList<>();
        for (Integer integer:integers
             ) {
            strings.add(integer.toString());

        }
        return strings;
    }
}
