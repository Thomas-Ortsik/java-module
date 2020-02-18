package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class TotalDiscountCalculator {
    public double calculate(List<Product> products) {
        double sum = products.stream()
                .map(Product::getPrice)
                .reduce(Double::sum).orElse(0.0);
        double discountSum = Discounts.get().stream()
                .map(discount -> discount.apply(products))
                .reduce(Double::sum).orElse(0.0);
        return sum - discountSum;
    }
}
