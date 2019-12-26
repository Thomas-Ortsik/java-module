package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.List;

public class Drawer {

    public Outfit getOutfitForToday(DayOfWeek day, Month month) {
        Outfit outfit = new Outfit(); //CONTINUE FROM HERE
        List<DayOfWeek> greenSockDays = List.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        List<Month> coldMonths = List.of(Month.NOVEMBER, Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);
        if (day == DayOfWeek.MONDAY) {
            outfit.socks = Socks.REDSOCKS;
        } else if (greenSockDays.contains(day)) {
            outfit.socks = Socks.GREENSOCKS;
        } else {
            outfit.socks = Socks.YELLOWSOCKS;
        }
        if ( coldMonths.contains(month)){
            outfit.headpiece = Headpiece.BEANIE;
        }
        else {
            outfit.headpiece = Headpiece.CAP;
        }
        return outfit;
    }


}
