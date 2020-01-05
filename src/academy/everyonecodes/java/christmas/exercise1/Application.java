package academy.everyonecodes.java.christmas.exercise1;

public class Application {

    //calculate if you've reached your macro goals for the day
    public static void main(String[] args) {
        Nutrisionist nutrisionist = new Nutrisionist();
        double totalCalories = nutrisionist.askDiet();
        double totalCarbs = totalCalories*0.5/4;
        double totalFats = totalCalories*0.3/9;
        double totalProteins = totalCalories*0.2/4;
        totalCarbs = nutrisionist.calculateRemainingMacros("carbs", totalCarbs);
        totalFats = nutrisionist.calculateRemainingMacros("fat", totalFats);
        totalProteins = nutrisionist.calculateRemainingMacros("proteins", totalProteins);
        System.out.println("You can still eat "+totalCarbs +"g of carbs, "+totalFats+"g of fat and "+totalProteins+"g of protein.");
    }
}
