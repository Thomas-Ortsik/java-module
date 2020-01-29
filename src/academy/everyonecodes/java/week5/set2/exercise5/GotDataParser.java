package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GotDataParser {
    public Optional<Character> parseLine(String textToParse) {
        String[] characterDetails = textToParse.split(";");

        if (characterDetails.length != 13){
            return Optional.empty();
        }
        String name = characterDetails[0];
        Optional<Integer> oGender = Optional.empty();
        Optional<Integer> oBookOfDeath = Optional.empty();
        try {
            oGender = Optional.of(Integer.parseInt(characterDetails[6]));
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            oGender = Optional.empty();
            System.out.println("gender failed");
        }
        try {
            oBookOfDeath = Optional.of(Integer.parseInt(characterDetails[3]));
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            oBookOfDeath = Optional.empty();
            System.out.println("book failed");
        }
        return Optional.of(new Character(name, oBookOfDeath, oGender));
    }
}