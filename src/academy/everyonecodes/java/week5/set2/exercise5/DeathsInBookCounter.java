package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;

public class DeathsInBookCounter {
    public int count(List<Character> characters, int book){
        int counter = 0;
        for (Character character: characters
             ) {
            if (character.getBookOfDeath("optional").isPresent()){
                if (character.getBookOfDeath("optional").get() == book){
                    counter++;
                }
            }
        }
        return counter;
    }
}
