package academy.everyonecodes.java.week2.set1.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void explain(Menu menu) {
        for (Dish dish : menu.getDishes()) {
            System.out.println(dish.getName() + " cost " + dish.getPrice() + "€.");
        }
    }

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<Dish>();
        Dish dishOne = new Dish("Noodles", 5.90);
        Dish dishTwo = new Dish("Rice", 4.30);
        Dish dishThree = new Dish("Meat", 8.20);
        dishes.add(dishOne);
        dishes.add(dishTwo);
        dishes.add(dishThree);
        Menu menu = new Menu("Flying Eater", dishes);
        explain(menu);
    }
}
