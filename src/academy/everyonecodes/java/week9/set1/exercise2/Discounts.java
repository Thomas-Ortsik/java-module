package academy.everyonecodes.java.week9.set1.exercise2;

import academy.everyonecodes.java.week9.set1.exercise2.discounts.Discount;
import academy.everyonecodes.java.week9.set1.exercise2.discounts.FiveOnWine;
import academy.everyonecodes.java.week9.set1.exercise2.discounts.SevenOnSweets;
import academy.everyonecodes.java.week9.set1.exercise2.discounts.TenOnVeggies;

import java.util.List;

public class Discounts {
    public static List<Discount> get() {
        return List.of(new FiveOnWine(), new SevenOnSweets(), new TenOnVeggies());
    }
}
