package academy.everyonecodes.java.evaluation1;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegersParser {
    public List<Integer> parse(String input){
        List<String> parsedStrings = List.of(input.split(" "));
        List<Integer> parsedInt = new ArrayList<>();
        for (String parsedString:parsedStrings
             ) {
            try {
                parsedInt.add(Integer.parseInt(parsedString));
            } catch (NumberFormatException e){
                return List.of();
            }
        }return parsedInt;
    }
}
