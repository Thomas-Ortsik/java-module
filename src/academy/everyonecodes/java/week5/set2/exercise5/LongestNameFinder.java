package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;

public class LongestNameFinder {

    public Character find(List<Character> characters){
        Character longest = characters.get(0);
        for (Character character:characters
             ) {
            if (character.getName().length()>longest.getName().length()){
                longest = character;
            }
        }
        return longest;
    }
}
