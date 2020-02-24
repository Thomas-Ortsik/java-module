package academy.everyonecodes.java.week10.set1.exercise1.cards;

public class CreditCard {
    private long number;
    private String creditProvider;


    public CreditCard(long number) {
        ProviderFinder finder = new ProviderFinder();
        this.number = number;
        this.creditProvider = finder.lookUpNumber(number);
    }


    public String getCreditProvider() {
        return creditProvider;
    }
}
