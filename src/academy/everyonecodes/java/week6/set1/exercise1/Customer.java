package academy.everyonecodes.java.week6.set1.exercise1;

public class Customer {
    private String name;
    private String customerClass = "economy";

    public String getName() {
        return name;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public Customer(String name) {
        this.name = name;
    }
}
