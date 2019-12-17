package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.List;

public class ShopAssistant {
    public List<Shoe> getAvailableShoes(){
        Shoe shoe1 = new Shoe(39, "pink");
        Shoe shoe2 = new Shoe(40, "red");
        Shoe shoe3 = new Shoe(38, "blue");
        Shoe shoe4 = new Shoe(42, "black");
        return List.of(shoe1, shoe2,shoe3,shoe4);
    }
}
