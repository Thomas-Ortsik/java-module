package academy.everyonecodes.java.week1.set2.exercise1;
import java.util.Scanner;

public class DogFood {
    public static int calculateJumps (int foodType){
        return 6 * foodType;
    }
    public static int calculateBarks (int foodType){
        return 1 + foodType;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean correctFood = false;
        while (correctFood == false) {
            System.out.println("Woof food do I get today!?");
            int foodReceived = scanner.nextInt();
            if (foodReceived == 1 || foodReceived == 0) {
                int jumps = calculateJumps(foodReceived);
                int barks = calculateBarks(foodReceived);
                System.out.println("I will jump " + jumps + " times and bark " + barks + " times!");
                correctFood = true;
            } else {
                System.out.println("Food has to be either 0 or 1.");
            }
        }
    }

}
