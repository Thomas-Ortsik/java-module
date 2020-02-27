package academy.everyonecodes.java.evaluation2.exercises.exercise3.powerups;

import academy.everyonecodes.java.evaluation2.exercises.exercise3.Spaceship;

public abstract class MysteryBox {
    private int intensity;

    public MysteryBox(int intensity) {
        this.intensity = intensity;
    }

    abstract void apply(Spaceship spaceship);
    protected int getIntensity(){
        return intensity;
    }
}
