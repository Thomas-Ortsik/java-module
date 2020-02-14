package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import java.util.List;

public class Fork implements Cutlery {
    @Override
    public String getName() {
        return "Fork";
    }

    @Override
    public boolean isUsedFor(String dish) {
        List<String> usedFor = List.of("fish","pizza","pasta");
        return usedFor.contains(dish.toLowerCase());
    }
}
