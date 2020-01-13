package academy.everyonecodes.java.week4.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PngCheckerTest {
    PngChecker pngChecker = new PngChecker();

    @ParameterizedTest
    @CsvSource({
            "false, test",
            "true, test.png",
            "false, test.png.jpg",
            "true, test.PnG",
            "false, test.pgn",
            "false, "
    })

    void check(boolean expected, String input){
        boolean result = pngChecker.check(input);
        Assertions.assertEquals(expected, result);
    }

}