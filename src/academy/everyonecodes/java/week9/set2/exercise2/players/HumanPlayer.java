package academy.everyonecodes.java.week9.set2.exercise2.players;

import academy.everyonecodes.java.week9.set2.exercise2.Moves;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Move;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Paper;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Rock;
import academy.everyonecodes.java.week9.set2.exercise2.moves.Scissors;

import java.util.Optional;
import java.util.Scanner;

public class HumanPlayer implements Player {
    private Move move;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Move turn() {
        Scanner scanner = new Scanner(System.in);
        Optional<Move> oMove = Optional.empty();
        while (oMove.isEmpty()) {
            System.out.println("These are your options: rock, paper, scissors");
            System.out.println("Choose one:");
            String chosenMove = scanner.nextLine();
            oMove = Moves.get().stream()
                    .filter(move -> move.getMoveType().equalsIgnoreCase(chosenMove))
                    .findFirst();
        }
        return oMove.get();
    }

    @Override
    public boolean playAgain() {
        System.out.println("Do you want to play again? y/n");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");

    }
}
