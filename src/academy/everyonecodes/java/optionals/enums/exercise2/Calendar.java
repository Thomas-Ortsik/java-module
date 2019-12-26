package academy.everyonecodes.java.optionals.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class Calendar {
    public DayOfWeek askForDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day of the week is it? (1-7)");
        int day = scanner.nextInt();
        return DayOfWeek.of(day);
    }
    public Month askForMonth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What month is it? (1-12)");
        int month = scanner.nextInt();
        return Month.of(month);
    }
}
