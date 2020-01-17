package academy.everyonecodes.java.week4.reflection.exercise1;

import java.util.List;

public class BeforeDashExtractor {
    public String extract(String textInput){
        String[] textSplit = textInput.split("-");
        if (textSplit.length == 1){
            return "";
        }
        return textSplit[0];
    }
}
