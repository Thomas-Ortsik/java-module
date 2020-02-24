package academy.everyonecodes.java.optionals.enums.secondtry.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    Shop shop;

    public ShopAssistant(Shop shop) {
        this.shop = shop;
    }

    private Size askForSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size do you have?");
        String size = scanner.nextLine();
        return Size.valueOf(size);
    }

    private List<TShirt> findShirtsThatFit(Size size) {
        List<TShirt> fittingShirts = new ArrayList<>();
        for (TShirt shirt : shop.getAvailableShirts()) {
            if (shirt.getSize() == size) {
                fittingShirts.add(shirt);
            }
        }
        return fittingShirts;
    }

    public void dealWithCustomer() {
        System.out.println("Welcome to everyone shops!");
        List<TShirt> shirtsForCustomer = findShirtsThatFit(askForSize());
        if (shirtsForCustomer.size() == 0) {
            System.out.println("I'm sorry, we have no shirts available for your size.");
        } else {
            for (TShirt shirt : shirtsForCustomer) {
                System.out.println("We have a " + shirt.getColor() + " shirt for " + shirt.getPrice() + " euro.");
            }
        }
    }
}
