package academy.everyonecodes.java.christmas.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static List<Integer> reverse(List<Integer> numbers){
        List<Integer> reversed = new ArrayList<>();
        for (int i=numbers.size()-1; i<=0;i--){
            reversed.add(numbers.get(i));
        }
        return reversed;
    }
    public static void main(String[] args) {
        List<Integer> originalNumbers = List.of(3,8,29);
        List<Integer> reversedNumbers = reverse(originalNumbers);
        for (int i = 0; i < originalNumbers.size(); i++) {
            System.out.println(originalNumbers.get(i));
        }
        for (int i = 0; i < reversedNumbers.size(); i++) {
            System.out.println(reversedNumbers);
        }
    }
}
