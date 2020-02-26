package academy.everyonecodes.java.evaluation2.optionals.maps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScoreCounterTest {
    ScoreCounter counter = new ScoreCounter();

    @Test
    void saveRoundWinnerAndGetWinner() {
        counter.saveRoundWinner(1, "thomas");
        counter.saveRoundWinner(2, "gina");
        counter.saveRoundWinner(3, "gina");
        counter.saveRoundWinner(4, "gina");
        counter.saveRoundWinner(5, "thomas");
        String expected = "gina";
        String result = counter.getWinner();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void saveRoundWinnerAndGetWinnerWithDrawShouldReturnFirstWinner() {
        counter.saveRoundWinner(1, "thomas");
        counter.saveRoundWinner(2, "gina");
        counter.saveRoundWinner(3, "gina");
        counter.saveRoundWinner(4, "thomas");
        String expected = "thomas";
        String result = counter.getWinner();
        Assertions.assertEquals(expected, result);
    }

}