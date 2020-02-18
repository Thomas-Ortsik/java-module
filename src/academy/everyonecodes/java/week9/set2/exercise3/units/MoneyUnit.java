package academy.everyonecodes.java.week9.set2.exercise3.units;

public class MoneyUnit {
    private double value;
    private String currency;

    public MoneyUnit(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }
}
