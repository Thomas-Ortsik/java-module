package academy.everyonecodes.java.week3.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganiserTest {
    Organiser organiser = new Organiser();


    @Test
    void generateNewName() {
        String input = "bla.jpg";

        String result = organiser.generateNewName(input);

        String expected = "bla.png";
        Assertions.assertEquals(expected, result);
    }
}