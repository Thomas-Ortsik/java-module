package academy.everyonecodes.java.week9.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car = new Car("Renault", null) {
        @Override
        public String refuel() {
            return null;
        }
    };

    @Test

    void describe(){
        String expected = "I am a Renault car!";
        String result = car.describe();
        Assertions.assertEquals(expected, result);
    }

    @Test

    void electricCarTest(){
        Car electricCar = new ElectricCar("Mercedes");
        String expectedDescription = "I am a Mercedes car!";
        String expectedRefueling = "I am recharging my electric car";
        String resultDescription = electricCar.describe();
        String resultRefueling = electricCar.refuel();
        Assertions.assertEquals(expectedDescription, resultDescription);
        Assertions.assertEquals(expectedRefueling, resultRefueling);
    }

}