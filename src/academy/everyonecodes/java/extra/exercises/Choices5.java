package academy.everyonecodes.java.extra.exercises;

import java.util.List;
import java.util.Scanner;


public class Choices5 {
    public static boolean isBringing(String item) {
        Scanner scanner = new Scanner(System.in);
        List<String> yeses = List.of("yes", "yeah", "ahoy", "i do", "yes, sir!", "true", "totally");
        switch (item) {
            case "hat":
                System.out.println("Are you wearing a hat?");
                break;
            case "pet":
                System.out.println("Are you bringing a pet?");
                break;
        }
        String customerAnswer = scanner.nextLine();
        customerAnswer = customerAnswer.toLowerCase();
        if (yeses.contains(customerAnswer)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean isWearingHat = isBringing("hat");
        boolean isBriningPet = isBringing("pet");
        if (isBriningPet == true || isWearingHat == true){
            System.out.println("I'm sorry, but you're not allowed to enter.");}
        else {
            System.out.println("Welcome to our cinema, how may I assist you?");
    }

}
}
