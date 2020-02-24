package academy.everyonecodes.java.week10.set1.exercise1.cards;

import java.util.List;

public class Providers {
    private static List<Provider> providers = List.of(new AmericanExpress(), new MasterCard(), new Visa());

    static List<Provider> get() {
        return providers;
    }
}
