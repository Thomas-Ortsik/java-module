package academy.everyonecodes.java.week2.set1.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String name = "Some Dish";
        int timeToPrepare = 23;
        List<String> ingredients = List.of("Water", "Flour", "Salt", "Foodstuff");
        List<String> steps = List.of("Put flour in water", "Salt the foodstuff", "combine both and cook");
        Recipe masterCooking = new Recipe(name, timeToPrepare, ingredients, steps);
    }
}
