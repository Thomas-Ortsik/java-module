package academy.everyonecodes.java.week9.set2.exercise2.moves;

import academy.everyonecodes.java.week9.set2.exercise2.Winstate;

public class Rock extends Move {
    public Rock() {
        super("rock");
    }


    @Override
    public Winstate compareMove(Move opponentMove) {
        ;if (opponentMove.equals(new Scissors())){
            return Winstate.WIN;
        }
        if (opponentMove.equals(new Paper())){
            return Winstate.LOSS;
        }
        return Winstate.DRAW;
    }
}
