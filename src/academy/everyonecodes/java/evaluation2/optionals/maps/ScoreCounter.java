package academy.everyonecodes.java.evaluation2.optionals.maps;

import java.util.HashMap;
import java.util.Map;

public class ScoreCounter {
    private Map<Integer, String> results = new HashMap<>();

    //i don't quite get what the map is supposed to store. Rounds doesn't make sense, since that would just be the list index (+1)
    //plus we never need to use the key. But for the sake of the exercise i will use Round as Key and name as value
    public void saveRoundWinner(int round, String winner) {
        results.put(round, winner);
    }

    public String getWinner() {
        String namePlayerOne = results.get(1);
        String namePlayerTwo = "";
        int scoreOne = 0;
        int scoreTwo = 0;
        int roundsPlayed = results.size();
        for (int i = 1; i <= roundsPlayed; i++) {
            String winnerOfRound = results.get(i);
            if (winnerOfRound.equalsIgnoreCase(namePlayerOne)) {
                scoreOne++;
            } else {
                if (namePlayerTwo.equals("")) {
                    namePlayerTwo = winnerOfRound;
                }
                scoreTwo++;
            }
        }
        if (scoreOne < scoreTwo) {
            return namePlayerTwo;
        }
        return namePlayerOne;
    }
}
