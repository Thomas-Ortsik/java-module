package academy.everyonecodes.java.week9.set1.exercise2.discounts;

import academy.everyonecodes.java.week9.set1.exercise2.Product;

import java.util.List;

public abstract class Discount {
    private int discountPercentage;
    private List<String> applicableProductNames;

    public Discount(int discountPercentage, List<String> applicableProductNames) {
        this.discountPercentage = discountPercentage;
        this.applicableProductNames = applicableProductNames;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public List<String> getApplicableProductNames() {
        return applicableProductNames;
    }

    public double apply(List<Product> products) {
        return products.stream()
                .map(this::getDiscount)
                .reduce(Double::sum).orElse(0.0);
    }

    private double getDiscount(Product product) {
        if (applicableProductNames.contains(product.getName())) {
            return product.getPrice() / 100 * discountPercentage;
        }
        return 0.0;
    }
}
