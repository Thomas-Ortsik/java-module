package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import java.util.List;

public class Knife implements Cutlery {
    @Override
    public String getName() {
        return "Knife";
    }

    @Override
    public boolean isUsedFor(String dish) {
        List<String> usedFor = List.of("fish", "pizza");
        return usedFor.contains(dish.toLowerCase());
    }
}
