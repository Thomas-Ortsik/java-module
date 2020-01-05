package academy.everyonecodes.java.christmas.exercise6;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> amounts = List.of(23,53,12,3,11);
        int total = 0;
        for (int i=0; i < amounts.size(); i++){
            total += amounts.get(i);
        }
        System.out.println("Total is "+total);
    }
}
