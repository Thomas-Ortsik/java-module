package academy.everyonecodes.java.evaluation1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringToIntegersParserTest {
    StringToIntegersParser stringToIntegersParser = new StringToIntegersParser();

    @Test

    void parse(){
        String input = "1 2 3 4";
        List<Integer> expected = List.of(1,2,3,4);
        List<Integer> result = stringToIntegersParser.parse(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void parseShouldReturnEmptyList(){
        String input = "Fkejcu";
        List<Integer> expected = List.of();
        List<Integer> result = stringToIntegersParser.parse(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void parseShouldAlsoReturnEmptyList(){
        String input = "1.0 2 3 4";
        List<Integer> expected = List.of();
        List<Integer> result = stringToIntegersParser.parse(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void parseShouldIncludeNegativeNumber(){
        String input = "1 -2 3 4";
        List<Integer> expected = List.of(1,-2,3,4);
        List<Integer> result = stringToIntegersParser.parse(input);
        Assertions.assertEquals(expected, result);
    }


}