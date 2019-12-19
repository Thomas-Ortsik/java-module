package academy.everyonecodes.java.optionals.arrays.exercise2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    private String[][] getEmptyGameField() {
        String[][] field = new String[3][3];
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                field[row][column] = " ";
            }
        }
        return field;
    }
    //is there an easier way to fill a String Array?


    private void printGameField(String[][] field) {
        String linePrint = "";
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                linePrint += "[" + field[row][column] + "]";
                if (column == 2) {
                    linePrint += "\n";
                }

            }
        }
        System.out.println(linePrint);

    }

    private void playOneRound(String[][] field, String playerName, String playerSymbol) {
        boolean validMove = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println(playerName + ", your turn. Choose the row for your next move.");
        while (!validMove) {
            int row = scanner.nextInt() - 1;
            System.out.println("And the column?");
            int column = scanner.nextInt() - 1;
            if (row >= 0 && row <= 2 && column >= 0 && column <= 2 && field[row][column].equals(" ")) {
                field[row][column] = playerSymbol;
                validMove = true;
            } else {
                System.out.println("Invalid move. Please choose the row again.");
            }
        }
    }

    private boolean hasWon(String a, String b, String c) {
        if (a != "X" && a != "O") {
            return false;
        }
        if (a == b && a == c) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isGameOver(String[][] field) {
        for (int i = 0; i < 3; i++) {
            if (hasWon(field[i][0], field[i][1], field[i][2])) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (hasWon(field[0][i], field[1][i], field[2][i])) {
                return true;
            }
        }
        if (hasWon(field[0][0], field[1][1], field[2][2]) || hasWon(field[0][2], field[1][1], field[2][0])) {
            return true;
        }
        return false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player X, what's your name?");
        String playerX = scanner.nextLine();
        System.out.println("Player O, what's your name?");
        String playerO = scanner.nextLine();
        String[][] field = getEmptyGameField();
        String currentPlayer = "";
        String symbol = "";
        printGameField(field);
        int turnNumber = 1;
        boolean isGameOver = false;
        boolean isTurnOfPlayerX = true;
        while (!isGameOver) {
            if (turnNumber > 9) {
                System.out.println("Draw. What a concept!");
                isGameOver = true;
            } else {
                if (isTurnOfPlayerX) {
                    currentPlayer = playerX;
                    symbol = "X";
                } else {
                    currentPlayer = playerO;
                    symbol = "O";
                }
                playOneRound(field, currentPlayer, symbol);
                printGameField(field);
                isGameOver = isGameOver(field);
                if (isGameOver) {
                    System.out.println("Congratulations " + currentPlayer + "! You won!");
                }
                isTurnOfPlayerX = !isTurnOfPlayerX;
                turnNumber++;
            }
        }
    }
}
