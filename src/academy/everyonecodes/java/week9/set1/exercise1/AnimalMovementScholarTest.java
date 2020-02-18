package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMovementScholarTest {
    AnimalMovementScholar scholar = new AnimalMovementScholar();

    @ParameterizedTest
    @CsvSource({
            "'walk, run', dog",
            "'walk, fly, swim', goose",
            "swim, salmon",
            "'crawl, climb', snake",
            "'walk, jump, swim', frog",
            "'walk, climb, fly', butterfly",
            "not an animal, bigfoot",
            "'climb, run, walk', mammal",
            "'fly, jump, swim, walk', bird",
            "swim, fish",
            "'climb, crawl', reptile",
            "'crawl, jump, swim, walk', amphibian",
            "'climb, fly, walk', arthropod"
    })

    void elaborate(String expected, String input){
        String result = scholar.elaborate(input);
        Assertions.assertEquals(expected, result);
    }

}