package academy.everyonecodes.java.evaluation1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PictureNameExtractorTest {
    PictureNameExtractor pictureNameExtractor = new PictureNameExtractor();

    @ParameterizedTest
    @CsvSource({
            "sunshine, 04847396SunshinePic.jpg",
            "hello world, 34829375hEllo-WORLDPic.jpg",
            "a b c, 03823944a-b-cPic.jpg"
    })
    void extract(String expected, String input) {
        String result = pictureNameExtractor.extract(input);
        Assertions.assertEquals(expected, result);
    }

}