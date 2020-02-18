package academy.everyonecodes.java.week9.set1.exercise1.animals.reptiles;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animals;

import java.util.List;

public class Reptile extends Animals {
    private boolean hasShell;

    public Reptile(String name, List<String> movement, boolean hasShell) {
        super(name, "reptile", movement);
        this.hasShell = hasShell;
    }

    public boolean isHasShell() {
        return hasShell;
    }
}
