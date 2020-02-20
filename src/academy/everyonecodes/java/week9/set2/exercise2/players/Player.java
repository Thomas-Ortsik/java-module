package academy.everyonecodes.java.week9.set2.exercise2.players;

import academy.everyonecodes.java.week9.set2.exercise2.moves.Move;

public interface Player {


    Move turn();

    boolean playAgain();
}
