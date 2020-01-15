package academy.everyonecodes.java.week4.set2.exercise1;

import java.lang.reflect.Array;

public class MoveTitleFormatter {
    public String format(String input){
        StringCapitalizer stringCapitalizer = new StringCapitalizer();
        input = input.trim();
        String[] words = input.split(" ");
        String formatted = "";
        for (String word:words){
            formatted = formatted + stringCapitalizer.capitalize(word) + " ";
        }
        formatted = formatted.trim();
        return formatted;
    }
}
