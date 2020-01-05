package academy.everyonecodes.java.christmas.exercise5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number <1 || number>10){
            System.out.println("Say a number between 1 and 10");
            number = scanner.nextInt();
        }
        System.out.println("Alright! Let's perform a trick with that number.");
    }
}
