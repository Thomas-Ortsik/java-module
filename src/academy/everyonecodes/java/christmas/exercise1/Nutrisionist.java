package academy.everyonecodes.java.christmas.exercise1;

import java.util.Scanner;

public class Nutrisionist {
    Scanner scanner = new Scanner(System.in);
    public double askDiet(){
        System.out.println("How many calories can you eat each day?");
        return scanner.nextDouble();
    }
    public double calculateRemainingMacros(String macro, double gramsRemaining){

        System.out.println("How many grams of " + macro + " did you eat?");
        double gramsEaten = scanner.nextInt();
        return gramsRemaining - gramsEaten;
    }
}
