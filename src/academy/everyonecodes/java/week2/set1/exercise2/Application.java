package academy.everyonecodes.java.week2.set1.exercise2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What color is the car?");
        String color = scanner.nextLine();
        System.out.println("And what year was it built in?");
        int yearBuilt = scanner.nextInt();
        Car carOne = new Car(color, yearBuilt);
    }
}
