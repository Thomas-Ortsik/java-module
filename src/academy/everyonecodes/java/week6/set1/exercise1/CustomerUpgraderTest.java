package academy.everyonecodes.java.week6.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerUpgraderTest {
    CustomerUpgrader customerUpgrader = new CustomerUpgrader();

    @Test

    void upgradeStartsAsEconomy(){
        Customer expected = new Customer("Lisa");
        expected.setCustomerClass("business");
        Customer result = new Customer("Lisa");
        customerUpgrader.upgrade(result);
        Assertions.assertEquals(result.getCustomerClass(), (expected.getCustomerClass()));

    }


    @Test

    void upgradeStartsAsBusiness(){
        Customer expected = new Customer("Lisa");
        expected.setCustomerClass("business");
        Customer result = new Customer("Lisa");
        result.setCustomerClass("business");
        customerUpgrader.upgrade(result);
        Assertions.assertEquals(result.getCustomerClass(), (expected.getCustomerClass()));

    }




}