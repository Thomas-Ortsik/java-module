package academy.everyonecodes.java.extra.games.battleship;

import java.util.ArrayList;
import java.util.List;

public class Battleship {


    public static void initializeBoard(List gameBoard) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                Tile tile = new Tile(x, y, "?");
                gameBoard.add(tile);
            }
        }
    }

    public static boolean checkHit(Integer line, Character column) {
        return false;
    }

    public static void main(String[] args) {
        /*
        System.out.println("__|A|B|C|D|E|F|G|H|I|J|");
        System.out.println("_1|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("_2|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("_3|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("_4|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("_5|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("_6|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("_7|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("_8|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("_9|_|_|_|_|_|_|_|_|_|_|");
        System.out.println("10|_|_|_|_|_|_|_|_|_|_|");
        */
        List<Tile> gameBoard = new ArrayList<>();
        initializeBoard(gameBoard);
        String visualBoard = "";
        for (Tile tile : gameBoard) {
            for (int i = 0; i<10; );
        }
    }
}