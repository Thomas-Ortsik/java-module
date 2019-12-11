package academy.everyonecodes.java.week1.set2.exercise2;
import java.util.List;
import java.util.ArrayList;

public class Combine {
    public static List<String> combine (List<String> listOne, List<String> listTwo){
        List<String> combined = new ArrayList<>();
        int position = 0;
        while (position < listOne.size() || position < listTwo.size()) {
            if (position < listOne.size()) {
                combined.add(listOne.get(position));
            }
            if (position < listTwo.size()) {
                combined.add(listTwo.get(position));
            }
            position++;
        }
        return combined;
    }

    public static void main(String[] args) {
        List<String> firstCollection = List.of("one", "three", "five");
        List<String> secondCollection = List.of("two", "four");
        List<String> combinedCollection = combine(firstCollection, secondCollection);
        for (String number : combinedCollection){
            System.out.println(number);
        }
    }
}

