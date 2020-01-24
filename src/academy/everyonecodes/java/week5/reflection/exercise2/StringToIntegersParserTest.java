package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegersParserTest {
    StringToIntegersParser stringToIntegersParser = new StringToIntegersParser();

    @Test

    void parse(){
        String input = "1;2;3;4";
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
        String input = "1.0;2;3;4";
        List<Integer> expected = List.of();
        List<Integer> result = stringToIntegersParser.parse(input);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void parseShouldIncludeNegativeNumber(){
        String input = "1;-2;3;4";
        List<Integer> expected = List.of(1,-2,3,4);
        List<Integer> result = stringToIntegersParser.parse(input);
        Assertions.assertEquals(expected, result);
    }


}