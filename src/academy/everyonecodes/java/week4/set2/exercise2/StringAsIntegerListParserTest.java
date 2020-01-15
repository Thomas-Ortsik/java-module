package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Array;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringAsIntegerListParserTest {
    StringAsIntegerListParser stringAsIntegerListParser = new StringAsIntegerListParser();



    @Test
    void parseWithSimpleValues(){
        String input = "1;2;3";
        List<Integer> expected = List.of(1,2,3);
        List<Integer> result = stringAsIntegerListParser.parse(input);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void parseWithTwoDigitValues(){
        String input = "11;22;33";
        List<Integer> expected = List.of(11,22,33);
        List<Integer> result = stringAsIntegerListParser.parse(input);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void parseWithNoValues(){
        String input = "";
        List<Integer> expected = List.of(0);
        List<Integer> result = stringAsIntegerListParser.parse(input);
        Assertions.assertEquals(expected,result);
    }

    @Test
    void parseWithNegativeNumberAndZeroes(){
        String input = "-1;0;0";
        List<Integer> expected = List.of(-1,0,0);
        List<Integer> result = stringAsIntegerListParser.parse(input);
        Assertions.assertEquals(expected,result);
    }
}