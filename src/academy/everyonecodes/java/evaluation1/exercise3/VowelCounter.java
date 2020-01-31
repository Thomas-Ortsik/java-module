package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;

public class VowelCounter {
    public int count(String input){
        int count = 0;
        List<String> vowels = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");  //i know, not a nice solution, but i just want to get it working for now
        for (int i = 0; i < input.length(); i++) {
            if (vowels.contains(input.substring(i, i+1))){
                count++;
            }

        } return count;
    }
}
