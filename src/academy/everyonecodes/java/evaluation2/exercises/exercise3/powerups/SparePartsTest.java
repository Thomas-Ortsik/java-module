package academy.everyonecodes.java.evaluation2.exercises.exercise3.powerups;

import academy.everyonecodes.java.evaluation2.exercises.exercise3.Spaceship;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SparePartsTest {
    SpareParts spareParts = new SpareParts(2);
    Spaceship spaceship = new Spaceship(5,5);

    @Test

    void apply(){
        int expected = 7;
        spareParts.apply(spaceship);
        int result = spaceship.getHealth();
        Assertions.assertEquals(expected, result);
    }

}