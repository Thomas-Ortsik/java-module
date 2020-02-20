package academy.everyonecodes.java.week9.set2.exercise2.players;

import academy.everyonecodes.java.week9.set2.exercise2.Moves;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Move;
import org.junit.jupiter.api.MethodOrderer;

import java.util.List;
import java.util.Random;

public class ComputerPlayer implements Player {


    @Override
    public Move turn() {
        Random random = new Random();
        List<Move> availableMoves = Moves.get();
        int movesSize = availableMoves.size();
        Move computerMove = availableMoves.get(random.nextInt(movesSize));
        System.out.println("Computer chose: " + computerMove.getMoveType());
        return computerMove;
    }

    @Override
    public boolean playAgain() {
        return true;
    }
}

