package academy.everyonecodes.java.week8.set2.exercise3;

public class Calculation {
    private Character symbol;
    private double number1;
    private double number2;

    public Calculation(Character symbol, double number1, double number2) {
        this.symbol = symbol;
        this.number1 = number1;
        this.number2 = number2;
    }

    public Character getSymbol() {
        return symbol;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }
}
