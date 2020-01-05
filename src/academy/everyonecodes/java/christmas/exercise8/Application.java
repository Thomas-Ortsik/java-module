package academy.everyonecodes.java.christmas.exercise8;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static List<Integer> replaceValue(int newValue, int position, List<Integer> list) {
        List<Integer> modifiedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i == position) {
                modifiedList.add(newValue);
            } else {
                modifiedList.add(list.get(i));
            }
        }
        return modifiedList;
    }

    public static List<Integer> incrementByOne(int position, List<Integer> list) {
        return replaceValue(list.get(position) + 1, position, list);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,2,4,5,6);
        List<Integer> modifiedList = incrementByOne(2, list);
    }
}
