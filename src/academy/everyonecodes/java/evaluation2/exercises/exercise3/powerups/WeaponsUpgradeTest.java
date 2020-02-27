package academy.everyonecodes.java.evaluation2.exercises.exercise3.powerups;

import academy.everyonecodes.java.evaluation2.exercises.exercise3.Spaceship;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponsUpgradeTest {
    WeaponsUpgrade upgrade = new WeaponsUpgrade(2);
    Spaceship ussEnterprise = new Spaceship(8,8);

    @Test

    void apply(){
        int expected = 10;
        upgrade.apply(ussEnterprise);
        int result = ussEnterprise.getDamage();
        Assertions.assertEquals(expected, result);
    }

}