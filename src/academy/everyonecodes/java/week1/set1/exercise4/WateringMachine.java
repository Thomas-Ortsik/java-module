package academy.everyonecodes.java.week1.set1.exercise4;

public class WateringMachine {
    public static void main(String[] args) {

        int plantsPerMachine = 4;
        int plantsOwned = 3;
        int plantsToBuy = 9;
        int plantsTotal = plantsOwned + plantsToBuy;
        double machinesNeeded = (double)plantsTotal / plantsPerMachine;
        int machinesNeededRounded = (int)machinesNeeded;
        if (machinesNeeded != machinesNeededRounded){
            machinesNeededRounded++;
        }
        int machinesOwned = 1;
        int numberOfWateringMachinesToBuy = machinesNeededRounded - machinesOwned;
        double priceOneMachine = 20;
        double priceTotal = priceOneMachine * numberOfWateringMachinesToBuy;
        double discountPercent = 20;
        double discount = discountPercent/100;
        double priceTotalAfterDiscount = priceTotal * (1 - discount);
        System.out.println("Price before discount: " + priceTotal + "\n" + "Price after discount: " + priceTotalAfterDiscount);


    }
}
