package academy.everyonecodes.java.week10.set1.exercise1;

import academy.everyonecodes.java.week10.set1.exercise1.cards.CreditCard;

public class Credit {

    public String evaluate(long ccNumber) {
        CreditCard card = new CreditCard(ccNumber);
        return card.getCreditProvider();
    }
}
