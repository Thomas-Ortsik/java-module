package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;

public class ScreenNameFormatter {
    public String create(Customer customer){
        if (customer.getCustomerClass().equals("business")){
            return customer.getName().toUpperCase();
        }
        if (customer.getCustomerClass().equals("economy")){
            return  customer.getName().toLowerCase();
        }
        else {return "Customer Data corrupted";}
    }
}
