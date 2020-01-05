package academy.everyonecodes.java.christmas.exercise4;

import java.util.Scanner;

public class Application {
    public static int getTotalTimeForFirstSeason(int episodes){
        return episodes*42;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many episodes have you watched?");
        int episodes = scanner.nextInt();
        int time = getTotalTimeForFirstSeason(episodes);
        System.out.println("The total amount of time spent watching those episodes is "+time+" minutes.");
    }
}
