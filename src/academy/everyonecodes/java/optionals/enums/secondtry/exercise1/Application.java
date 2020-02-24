package academy.everyonecodes.java.optionals.enums.secondtry.exercise1;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Shop everyoneShops = new Shop();
        ShopAssistant clerkHarry = new ShopAssistant(everyoneShops);
        List<TShirt> list = everyoneShops.getAvailableShirts();
        for (TShirt shirt : list) {
            System.out.println(shirt.getSize());
        }
        clerkHarry.dealWithCustomer();
    }
}
