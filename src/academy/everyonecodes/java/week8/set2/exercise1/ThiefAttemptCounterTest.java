package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThiefAttemptCounterTest {
    ThiefAttemptCounter counter = new ThiefAttemptCounter();

    @Test
    void open() {
        Safe safe1 = new Safe(4, 1);
        Safe safe2 = new Safe(3, 2);
        Thief badThief = new BeginnerThief();
        Thief goodThief = new AdvancedThief();
        int resultBadThief = counter.countAttempts(safe1, badThief);
        int resultGoodThief = counter.countAttempts(safe2, goodThief);
        int expectedBadThief = 4;
        int expectedGoodThief = 2;
        assertEquals(expectedBadThief, resultBadThief);
        assertEquals(expectedGoodThief, resultGoodThief);
    }
}