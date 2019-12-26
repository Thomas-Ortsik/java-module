package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Mirror {
    public void sayHowItLooks(DayOfWeek day, Month month, Outfit outfit){
        System.out.println("On a " + day + " in " + month + " Hansel is wearing " + outfit.headpiece.getDescription() + " and " + outfit.socks.getDescription() + ".");
    }
}
