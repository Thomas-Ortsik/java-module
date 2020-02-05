package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HappinessTopThreeFinderTest {

    HappinessTopThreeFinder happinessTopThreeFinder = new HappinessTopThreeFinder();

    @Test
    void findTopThree() {
        List<String> expected = List.of(
                "Country: Norway Score: 7.53700017929077",
                "Country: Denmark Score: 7.52199983596802",
                "Country: Iceland Score: 7.50400018692017");
        List<String> result = happinessTopThreeFinder.findTopThree();
        Assertions.assertEquals(expected, result);
    }
}