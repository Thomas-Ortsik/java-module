package academy.everyonecodes.java.optionals.enums.secondtry.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Mirror {
    public void sayHowItLooks(DayOfWeek day, Month month, Outfit outfit){
        System.out.println("On a " + day + " in " + month + " Hansel is wearing " + outfit.getHeadpiece().getDescription() + " and " + outfit.getSocks().getDescription() + ".");
    }
}
