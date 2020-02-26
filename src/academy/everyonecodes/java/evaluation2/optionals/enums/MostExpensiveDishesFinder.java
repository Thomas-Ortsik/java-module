package academy.everyonecodes.java.evaluation2.optionals.enums;

import java.util.Comparator;
import java.util.List;

public class MostExpensiveDishesFinder {
    public List<Dish> find(List<Dish> menu) {
        Dish expensiveStarter = menu.stream()
                .filter(dish -> dish.getCategory().equals(Category.STARTER))
                .max(Comparator.comparing(Dish::getPrice))
                .orElse(new Dish("Error", Category.STARTER, 00.0));
        Dish expensiveMain = menu.stream()
                .filter(dish -> dish.getCategory().equals(Category.MAIN))
                .max(Comparator.comparing(Dish::getPrice))
                .orElse(new Dish("Error", Category.STARTER, 00.0));
        Dish expensiveDessert = menu.stream()
                .filter(dish -> dish.getCategory().equals(Category.DESSERT))
                .max(Comparator.comparing(Dish::getPrice))
                .orElse(new Dish("Error", Category.STARTER, 00.0));


        return List.of(expensiveStarter, expensiveMain, expensiveDessert);
    }
}
