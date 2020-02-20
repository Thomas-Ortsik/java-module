package academy.everyonecodes.java.week9.set2.exercise2.moves;

import academy.everyonecodes.java.week9.set2.exercise2.Winstate;

public class Scissors extends Move {
    public Scissors() {
        super("scissors");
    }

    @Override
    public Winstate compareMove(Move opponentMove) {
        if (opponentMove.equals(new Rock())){
            return Winstate.LOSS;
        }
        if (opponentMove.equals(new Paper())){
            return Winstate.WIN;
        }
        return Winstate.DRAW;
    }
}
