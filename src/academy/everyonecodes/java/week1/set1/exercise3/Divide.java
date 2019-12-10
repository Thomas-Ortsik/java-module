package academy.everyonecodes.java.week1.set1.exercise3;

public class Divide {
    public static double divideNumbers (double numberOne, double numberTwo) {
        return numberOne/numberTwo;
    }

    public static void main(String[] args) {
        double number = 20;
        double divisor = 3;
        System.out.println("The quotient is " + divideNumbers(number, divisor));
    }
}
