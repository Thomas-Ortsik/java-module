package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScreenNameFormatterTest {
    ScreenNameFormatter screenNameFormatter = new ScreenNameFormatter();

    @Test

    void createBusinessCustomer(){
        Customer customer = new Customer("Anton");
        customer.setCustomerClass("business");
        String expected = "ANTON";
        String result = screenNameFormatter.create(customer);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void createEconomyCustomer(){
        Customer customer = new Customer("Anton");
        customer.setCustomerClass("economy");
        String expected = "anton";
        String result = screenNameFormatter.create(customer);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void createWithEmptyStringShouldReturnEmpty(){
        Customer customer = new Customer("");
        customer.setCustomerClass("business");
        String expected = "";
        String result = screenNameFormatter.create(customer);
        Assertions.assertEquals(expected, result);
    }


}