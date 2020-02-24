package academy.everyonecodes.java.optionals.enums.secondtry.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        Drawer drawer = new Drawer();
        Mirror mirror = new Mirror();
        Calendar calendar = new Calendar();
        DayOfWeek day = calendar.askForDay();
        Month month = calendar.askForMonth();
        Outfit outfit = drawer.getOutfitForToday(day, month);
        mirror.sayHowItLooks(day, month, outfit);
    }
}
