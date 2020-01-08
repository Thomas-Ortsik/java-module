package academy.everyonecodes.java.week3.set2.exercise5;

public class PowerCalculator {
    public double calculate(double number, double power){
        double result = 1;
        for (int i = 0; i < power; i++) {
            result = result*number;
        }
        return result;
    }
}

