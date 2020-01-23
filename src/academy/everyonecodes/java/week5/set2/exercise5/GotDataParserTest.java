package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GotDataParserTest {
    GotDataParser gotDataParser = new GotDataParser();

    private boolean oCharacterCompare(Optional<Character> oExpected, Optional<Character> oResult){
        Character expected = oExpected.get();
        Character result = oResult.get();
        boolean sameName = expected.getName().equals(result.getName());
        boolean sameBook = expected.getBookOfDeath("as optional").orElse(0) == result.getBookOfDeath("as optional").orElse(0);
        boolean sameGender = expected.getGender("as optional").orElse(3) == result.getGender("as optional").orElse(3);
        return sameBook==sameGender==sameName==true;
    }

    @Test

    void parseLineShouldReturnEmpty(){
        String input = "Name;;;;;;;;;;;;;;";
        Optional<Character> result = gotDataParser.parseLine(input);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test

    void parseJustFuckingWorkAlready(){
        String input = "Alan of Rosby;Night's Watch;300;5;4;18;1;1;0;1;1;0;1";
        Optional<Character> result = gotDataParser.parseLine(input);
        Optional<Character> expected = Optional.of(new Character("Alan of Rosby", Optional.of(5), Optional.of(1)));
        Assertions.assertTrue(oCharacterCompare(expected,result));
    }


    @Test

    void parseOkNowWouldYouAlsoWork(){
        String input = "Alla Tyrell;House Tyrell;;;;6;0;1;0;0;1;1;0";
        Optional<Character> oResult = gotDataParser.parseLine(input);
        Optional<Character> oExpected = Optional.of(new Character("Alla Tyrell", Optional.empty(), Optional.of(0)));
        Assertions.assertTrue(oCharacterCompare(oExpected, oResult));
    }

}