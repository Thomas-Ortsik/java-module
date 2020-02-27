package academy.everyonecodes.java.evaluation2.exercises.exercise3.powerups;

import academy.everyonecodes.java.evaluation2.exercises.exercise3.Spaceship;

public class WeaponsUpgrade extends MysteryBox {
    public WeaponsUpgrade(int intensity) {
        super(intensity);
    }

    @Override
    void apply(Spaceship spaceship) {
        spaceship.setDamage(spaceship.getDamage() + getIntensity());
    }
}
