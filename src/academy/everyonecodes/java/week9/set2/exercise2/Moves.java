package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Paper;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Rock;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Scissors;

import java.util.List;

public class Moves {
    private static List<Move> availableMoves = List.of(new Rock(), new Paper(), new Scissors());

    public static List<Move> get() {
        return availableMoves;
    }
}
