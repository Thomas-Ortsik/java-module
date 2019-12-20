package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    public Cart walkThroughShop(String name) {
        List<CartItem> cartItems = new ArrayList<>();
        Cart cart = new Cart(cartItems, name);
        System.out.println("Hello " + name + ", welcome to our shop!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What do you want to buy?");
            String item = scanner.nextLine();
            if (item.equals("")) {
                System.out.println("Thank ou for shopping with us!");
                break;
            } else {
                System.out.println("How much does it cost?");
                double price = scanner.nextDouble();
                scanner.nextLine();
                Product product = new Product(item, price);
                System.out.println("How many do you want?");
                int amount = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Thank you, we will put that in the cart!");
                CartItem cartItem = new CartItem(product, amount);
                cartItems.add(cartItem);

            }
        }
        return cart;
    }
}
