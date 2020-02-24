package academy.everyonecodes.java.optionals.enums.secondtry.exercise2;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.List;

public class Drawer {

    public Outfit getOutfitForToday(DayOfWeek day, Month month) {
        Outfit outfit = new Outfit(); //CONTINUE FROM HERE
        List<DayOfWeek> greenSockDays = List.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        List<Month> coldMonths = List.of(Month.NOVEMBER, Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);
        if (day == DayOfWeek.MONDAY) {
            outfit.setSocks(Socks.REDSOCKS);
        } else if (greenSockDays.contains(day)) {
            outfit.setSocks(Socks.GREENSOCKS);
        } else {
            outfit.setSocks(Socks.YELLOWSOCKS);
        }
        if (coldMonths.contains(month)) {
            outfit.setHeadpiece(Headpiece.BEANIE);
        } else {
            outfit.setHeadpiece(Headpiece.CAP);
        }
        return outfit;
    }


}
