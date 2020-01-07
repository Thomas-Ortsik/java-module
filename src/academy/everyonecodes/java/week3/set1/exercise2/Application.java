package academy.everyonecodes.java.week3.set1.exercise2;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        Watchtime watchtime = new Watchtime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many episodes have you watched?");
        int episodes = scanner.nextInt();
        int time = watchtime.getTotalTimeForFirstSeason(episodes);
        System.out.println("The total amount of time spent watching those episodes is "+time+" minutes.");
    }
}
