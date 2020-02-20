package academy.everyonecodes.java.week9.set2.exercise2.moves;

import academy.everyonecodes.java.week9.set2.exercise2.Winstate;

import java.util.Objects;

public abstract class Move {
    private String moveType;

    public Move(String moveType) {
        this.moveType = moveType;
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Move move = (Move) o;
        return Objects.equals(moveType, move.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moveType);
    }

    public abstract Winstate compareMove(Move opponentMove);
}



