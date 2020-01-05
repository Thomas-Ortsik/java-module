package academy.everyonecodes.java.christmas.exercise3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good day! What burger do you want?");
        String burger = scanner.nextLine();
        System.out.println("Do you want french fries with that?");
        String fries = scanner.nextLine();
        double total = 0;
        if (burger.equals("Big Gear Burger")){
            total += 6.5;
        }
        if (burger.equals("Mc Buttons Long Burger")){
            total += 7.2;
        }
        if (burger.equals("Veggie Circuits Burger")){
            total += 5.7;
        }
        if (fries.equals("yes")){
            total +=2.5;
        }
        System.out.println("It's "+total+" Euro, please!");
    }
}
