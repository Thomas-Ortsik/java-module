package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HappinessSpecialFiveFinderTest {

    HappinessSpecialFiveFinder finder = new HappinessSpecialFiveFinder();

    @Test
    void findSpecialFive() {
        List<String> expected = List.of(
                "Country: Burkina Faso Rank: 134",
                "Country: Afghanistan Rank: 141",
                "Country: Madagascar Rank: 144",
                "Country: South Sudan Rank: 147",
                "Country: Central African Republic Rank: 155"
        );

        List<String> result = finder.findSpecialFive();
        Assertions.assertEquals(expected, result);
    }

}