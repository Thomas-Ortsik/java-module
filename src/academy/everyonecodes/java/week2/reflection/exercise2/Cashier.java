package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;

import java.util.List;

public class Cashier {
    public void billCustomer(Cart cart){
        List<CartItem> cartItems = cart.getCartItems();
        double priceTotal = 0;
        for (CartItem item : cartItems){
            double priceItem = item.getProduct().getPrice() * item.getAmount();
            priceTotal += priceItem;
        }
        System.out.println(cart.getName() + " has to pay " +priceTotal + " Euros.");
    }
}
