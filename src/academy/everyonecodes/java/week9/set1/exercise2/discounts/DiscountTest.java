package academy.everyonecodes.java.week9.set1.exercise2.discounts;

import academy.everyonecodes.java.week9.set1.exercise2.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {
    //abstract class, so i'm testing with FiveOnWine
    Discount discount = new FiveOnWine();

    @Test

    void apply(){
        Product product1 = new Product("wine", 10.0);
        Product product2 = new Product("NaN", 3948.32);
        List<Product> input = List.of(product1, product2);
        double result = discount.apply(input);
        double expected = 0.5;
        assertEquals(expected, result);
    }

}