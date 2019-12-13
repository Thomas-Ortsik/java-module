package academy.everyonecodes.java.week1.reflection.exercise2;


import java.util.Scanner;

public class AskForNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number > 10 || number < 1) {
            System.out.println("Say a number from 1 to 10");
            number = scanner.nextInt();
        }
        System.out.println("Alright! Let's perform a trick with " + number);

    }
}


