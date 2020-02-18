package academy.everyonecodes.java.week9.set1.exercise1.animals;

import academy.everyonecodes.java.week9.set1.exercise1.animals.amphibians.Caecilian;
import academy.everyonecodes.java.week9.set1.exercise1.animals.amphibians.Frog;
import academy.everyonecodes.java.week9.set1.exercise1.animals.arthropods.Butterfly;
import academy.everyonecodes.java.week9.set1.exercise1.animals.arthropods.Spider;
import academy.everyonecodes.java.week9.set1.exercise1.animals.birds.Goose;
import academy.everyonecodes.java.week9.set1.exercise1.animals.birds.Sparrow;
import academy.everyonecodes.java.week9.set1.exercise1.animals.fish.Angelfish;
import academy.everyonecodes.java.week9.set1.exercise1.animals.fish.Salmon;
import academy.everyonecodes.java.week9.set1.exercise1.animals.mammals.Dog;
import academy.everyonecodes.java.week9.set1.exercise1.animals.mammals.Gorilla;
import academy.everyonecodes.java.week9.set1.exercise1.animals.reptiles.Snake;
import academy.everyonecodes.java.week9.set1.exercise1.animals.reptiles.Turtle;

import java.util.List;

public class Animals {
    private String name;
    private String kind;
    private List<String> movement;

    public Animals(String name, String kind, List<String> movement) {
        this.name = name;
        this.kind = kind;
        this.movement = movement;
    }

    public static List<Animals> get() {
        return List.of(
                new Dog(),
                new Gorilla(),
                new Goose(),
                new Sparrow(),
                new Salmon(),
                new Angelfish(),
                new Snake(),
                new Turtle(),
                new Frog(),
                new Caecilian(),
                new Spider(),
                new Butterfly());
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public List<String> getMovement() {
        return movement;
    }
}
