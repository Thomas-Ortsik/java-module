package academy.everyonecodes.java.week3.set1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Reverser reverser = new Reverser();
        List<Integer> originalNumbers = List.of(3,8,29);
        List<Integer> reversedNumbers = reverser.reverse(originalNumbers);
        for (int i = 0; i < originalNumbers.size(); i++) {
            System.out.println(originalNumbers.get(i));
        }
        for (int i = 0; i < reversedNumbers.size(); i++) {
            System.out.println(reversedNumbers.get(i));
        }
    }
}
