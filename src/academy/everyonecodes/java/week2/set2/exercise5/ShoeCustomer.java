package academy.everyonecodes.java.week2.set2.exercise5;

public class ShoeCustomer {
    private int shoeSize;

    public ShoeCustomer(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public boolean tryShoe(Shoe shoe) {
        if (shoe.getShoeSize() == shoeSize) {
            return true;
        } else {
            return false;
        }
    }
}