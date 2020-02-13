package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.Optional;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation:");
        String userInput = scanner.nextLine();
        Optional<Double> oResult = calculator.calculate(userInput);
        if (oResult.isEmpty()) {
            System.out.println("Solution: Operation not available");
        }
        if (oResult.isPresent()) {
            System.out.println("Solution: " + oResult.get());
        }
    }
}
