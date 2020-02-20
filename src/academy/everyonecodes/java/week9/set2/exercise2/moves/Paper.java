package academy.everyonecodes.java.week9.set2.exercise2.moves;

import academy.everyonecodes.java.week9.set2.exercise2.Winstate;

public class Paper extends Move{

    public Paper() {
        super("paper");
    }

    @Override
    public Winstate compareMove(Move opponentMove) {
        if (opponentMove.equals(new Scissors())){
            return Winstate.LOSS;
        }
        if (opponentMove.equals(new Rock())){
            return Winstate.WIN;
        }
        return Winstate.DRAW;
    }
}
