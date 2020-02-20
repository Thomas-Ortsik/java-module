package academy.everyonecodes.java.week9.set2.exercise2;

public class Game {
    private DecisionMaker decisionMaker = new DecisionMaker();

    public void play() {
        System.out.println("Let's play rock, paper, scissors!");
        while (true) {
            decisionMaker.playRound();
            if (!decisionMaker.playAgain()) {
                break;
            }
        }
    }
}
