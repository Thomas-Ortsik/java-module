package academy.everyonecodes.java.week6.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();

    @ParameterizedTest
    @CsvSource({
            "male, Mr. Dookie",
            "female, Mrs. Dookie",
            "female, Ms. Dookie",
            "privileged, Mrs. Dookie Hokopoko",
            "privileged, Hokopoko",
            "privileged, Totally Hokopoko",
            "default, Dookie"
    })
    void choose(String expected, String input) {
        String result = templateChooser.choose(input);
        Assertions.assertEquals(expected, result);
    }
}