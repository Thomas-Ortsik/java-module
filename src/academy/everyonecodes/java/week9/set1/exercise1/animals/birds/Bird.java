package academy.everyonecodes.java.week9.set1.exercise1.animals.birds;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animals;

import java.util.List;

public class Bird extends Animals {
    private String featherColor;

    public Bird(String name, List<String> movement, String featherColor) {
        super(name, "bird", movement);
        this.featherColor = featherColor;
    }
}

