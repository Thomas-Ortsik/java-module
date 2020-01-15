package academy.everyonecodes.java.week4.set2.exercise5;

public class TipAdder {
    public double add(double bill){
        bill = bill*1.05;
        double billRoundDown = Math.floor(bill);
        if ((billRoundDown+0.5) < bill ){
            return Math.ceil(bill);
        }
        if (bill == (int)bill){
            return bill;
        }
        return billRoundDown+0.5;
    }
}
