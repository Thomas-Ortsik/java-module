package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GotDataReaderTest {
    GotDataReader gotDataReader = new GotDataReader();

    private boolean characterObjectTester(Character expected, Character result){
        boolean sameName = expected.getName().equals(result.getName());
        boolean sameBook;
        boolean sameGender;
        if (expected.getBookOfDeath("").isPresent() && result.getBookOfDeath("").isPresent()){
            sameBook = expected.getBookOfDeath("").get() == result.getBookOfDeath("").get();
        } else {
            sameBook = expected.getBookOfDeath("").isEmpty() == result.getBookOfDeath("").isEmpty();
        }
        if (expected.getGender("").isPresent() && result.getBookOfDeath("").isPresent()){
            sameGender = expected.getGender("").get() == result.getGender("").get();
        } else {
            sameGender = expected.getGender("").isEmpty() == result.getGender("").isEmpty();
        }
        if (sameName && sameBook && sameGender){
            return true;}
        return false;
        }

    @Test

    void read(){
        Character expectedFirst = new Character("Addam Marbrand", Optional.empty(), Optional.of(1));
        Character expectedLast = new Character("Talbert Serry", Optional.of(4), Optional.of(1));
        List<Character> results = gotDataReader.read();
        Assertions.assertTrue(characterObjectTester(expectedFirst, results.get(1)));
        Assertions.assertTrue(characterObjectTester(expectedLast, results.get(results.size()-1)));
    }

}