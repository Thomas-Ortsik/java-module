package academy.everyonecodes.java.week3.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatchtimeTest {
    Watchtime watchtime = new Watchtime();

    @Test
    void getTotalTimeForFirstSeason() {

        int input = 2;

        int result = watchtime.getTotalTimeForFirstSeason(input);

        int expected = 84;
        Assertions.assertEquals(expected, result);
    }
}