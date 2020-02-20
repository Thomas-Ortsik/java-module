package academy.everyonecodes.java.week9.set2.exercise1.units;

import java.util.Objects;

public abstract class MoneyUnit {
    private double value;
    private String currency;

    public MoneyUnit(double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoneyUnit moneyUnit = (MoneyUnit) o;
        return Double.compare(moneyUnit.value, value) == 0 &&
                Objects.equals(currency, moneyUnit.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }
}
