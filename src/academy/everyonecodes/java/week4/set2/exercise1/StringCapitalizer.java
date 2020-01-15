package academy.everyonecodes.java.week4.set2.exercise1;

public class StringCapitalizer {
    public String capitalize(String toCapitalize) {
        String trimmedLowerCased = toCapitalize.trim().toLowerCase();
        String firstLetter = trimmedLowerCased.substring(0, 1).toUpperCase();
        return firstLetter + trimmedLowerCased.substring(1);
    }
}
