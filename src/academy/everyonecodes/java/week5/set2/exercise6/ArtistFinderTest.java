package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ArtistFinderTest {
    ArtistFinder artistFinder = new ArtistFinder();

    @ParameterizedTest
    @CsvSource({
            "Anuel AA, China",
            "Lil Tecca, Ransom",
            "Marshmello, Happier"
    })

    void findFor(String expected, String input){
        Optional<String> result = artistFinder.findFor(input);
        System.out.println(expected + " " + result.get());
        Assertions.assertEquals(expected, result.get());
    }

}