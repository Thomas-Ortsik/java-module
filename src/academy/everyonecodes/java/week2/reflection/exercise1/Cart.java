package academy.everyonecodes.java.week2.reflection.exercise1;

import java.util.List;

public class Cart {
    private List<CartItem> cartItems;
    private String name;

    public Cart(List<CartItem> cartItems, String name) {
        this.cartItems = cartItems;
        this.name = name;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public String getName() {
        return name;
    }
}
