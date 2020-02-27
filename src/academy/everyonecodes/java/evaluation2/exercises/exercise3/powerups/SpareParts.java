package academy.everyonecodes.java.evaluation2.exercises.exercise3.powerups;

import academy.everyonecodes.java.evaluation2.exercises.exercise3.Spaceship;

public class SpareParts extends MysteryBox {

    public SpareParts(int intensity) {
        super(intensity);
    }

    @Override
    void apply(Spaceship spaceship) {
        spaceship.setHealth(spaceship.getHealth() + getIntensity());
    }
}
