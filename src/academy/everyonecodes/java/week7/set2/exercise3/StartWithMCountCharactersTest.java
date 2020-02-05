package academy.everyonecodes.java.week7.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class StartWithMCountCharactersTest {

    @Test
    void test() {
        List<String> names = List.of("Mary", "Joe", "Max", "Laura");
        Optional<Integer> oLengthOfMNames = names.stream()
                .filter(name -> name.startsWith("M"))
                .map(name -> name.length())
                .reduce(Integer::sum);

        Assertions.assertTrue(oLengthOfMNames.isPresent());
        int expected = 7;
        Assertions.assertEquals(expected, oLengthOfMNames.get());


    }
}
