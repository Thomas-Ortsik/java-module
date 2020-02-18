package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AnimalKindScholarTest {
    AnimalKindScholar scholar = new AnimalKindScholar();

    @ParameterizedTest
    @CsvSource({
            "mammal, dog",
            "mammal, gorilla",
            "bird, goose",
            "bird, sparrow",
            "fish, salmon",
            "fish, angelfish",
            "reptile, snake",
            "reptile, turtle",
            "amphibian, frog",
            "amphibian, caecilian",
            "arthropod, spider",
            "arthropod, butterfly",
            "not an animal, bigfoot",
            "'dog, gorilla', mammal",
            "'goose, sparrow', bird",
            "'angelfish, salmon', fish",
            "'snake, turtle', reptile",
            "'caecilian, frog', amphibian",
            "'butterfly, spider', arthropod"
    })

    void elaborate(String expected, String input){
        String result = scholar.elaborate(input);
        Assertions.assertEquals(expected, result);
    }

}