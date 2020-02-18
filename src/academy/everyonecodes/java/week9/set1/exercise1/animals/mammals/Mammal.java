package academy.everyonecodes.java.week9.set1.exercise1.animals.mammals;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animals;

import java.util.List;

public class Mammal extends Animals {
    private String hairColor;

    public String getHairColor() {
        return hairColor;
    }

    public Mammal(String name, List<String> movement, String hairColor) {
        super(name, "mammal", movement);
        this.hairColor = hairColor;
    }
}
