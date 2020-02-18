package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TotalDiscountCalculatorTest {

    TotalDiscountCalculator calculator = new TotalDiscountCalculator();

    @Test

    void calculate(){
        Product product1 = new Product("wine", 10.0);
        Product product2 = new Product("NaN", 100.0);
        Product product3 = new Product("paprika", 10.0);
        Product product4 = new Product("candy", 10.0);
        List<Product> input = List.of(product1, product2, product3, product4);
        double expected = 9.5 + 100 + 9.00 + 9.3;
        double result = calculator.calculate(input);
        assertEquals(expected, result);
    }

}