package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.players.ComputerPlayer;
import academy.everyonecodes.java.week9.set2.exercise2.players.HumanPlayer;
import academy.everyonecodes.java.week9.set2.exercise2.players.Player;

public class DecisionMaker {
    private Player human = new HumanPlayer();
    private Player computer = new ComputerPlayer();

    public void playRound(){
        Move humanMove = human.turn();
        Move computerMove = computer.turn();
        Winstate result = humanMove.compareMove(computerMove);
        System.out.println(result.getDescription());
    }

    public boolean playAgain(){
        return human.playAgain() && computer.playAgain();
    }
}
