package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ShoeCustomer shoeCustomer1 = new ShoeCustomer(38);
        ShoeCustomer shoeCustomer2 = new ShoeCustomer(42);
        List<ShoeCustomer> customers = List.of(shoeCustomer1, shoeCustomer2);
        ShopAssistant shopAssistant = new ShopAssistant();
        for (ShoeCustomer customer : customers) {
            for (Shoe availableShoe : shopAssistant.getAvailableShoes()) {
                if (customer.tryShoe(availableShoe)) {
                    System.out.println("I will take the " + availableShoe.getColor() + " one!");
                } else {
                    System.out.println("Nope, this one doesn't fit, sorry!");
                }
            }
        }
    }
}