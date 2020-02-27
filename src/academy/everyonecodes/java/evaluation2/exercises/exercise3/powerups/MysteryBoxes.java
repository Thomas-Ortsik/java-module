package academy.everyonecodes.java.evaluation2.exercises.exercise3.powerups;

import java.util.List;

public class MysteryBoxes {
    private static List<MysteryBox> powerups = List.of(new SpareParts(1), new SpareParts(2), new WeaponsUpgrade(1), new WeaponsUpgrade(2));

    public static List<MysteryBox> get(){
        return powerups;
    }
}
