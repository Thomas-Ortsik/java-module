package academy.everyonecodes.java.evaluation2.optionals.arrays;

import java.util.Arrays;

public class OfficePersonalSpace {
    private String[] space;

    public OfficePersonalSpace() {
        this.space = new String[20];
        Arrays.fill(space, "Empty");
    }

    public void add(int employeeNumber, String inputItem) {
        int arrayIndexEmployee = employeeNumber - 1;
        String itemsInBox = space[arrayIndexEmployee];
        if (itemsInBox.equals("Empty")) {
            space[arrayIndexEmployee] = inputItem;
        } else {
            space[arrayIndexEmployee] = itemsInBox + " " + inputItem;
        }
    }

    public void empty(int employeeNumber) {
        space[employeeNumber - 1] = "Empty";
    }

    //not sure if by get we should also empty (since you "take something out" in real life, but since we have an empty method, i won't
    public String get(int employeeNumber) {
        return space[employeeNumber - 1];
    }
}
