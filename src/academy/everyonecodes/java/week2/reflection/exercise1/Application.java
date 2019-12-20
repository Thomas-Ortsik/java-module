package academy.everyonecodes.java.week2.reflection.exercise1;

public class Application {
    public static void main(String[] args) {
        Product soap = new Product("Soap", 2.59);
        Product bread = new Product("Bread", 3.99);
        bread.setPrice(3.19);
        CartItem soapToBuy = new CartItem(soap, 2);
        CartItem breadToBuy = new CartItem(bread, 1);
        breadToBuy.setAmount(3);
    }
}
