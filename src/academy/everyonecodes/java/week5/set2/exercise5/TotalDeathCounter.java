package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;

public class TotalDeathCounter {

    public int count(List<Character> characters){
        int counter = 0;
        for (Character character:characters
             ) {
            if (character.getBookOfDeath("optional").isPresent()){counter++;}

        }return counter;
    }
}
