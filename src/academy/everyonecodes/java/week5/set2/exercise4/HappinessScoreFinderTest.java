package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HappinessScoreFinderTest {
    HappinessScoreFinder happinessScoreFinder = new HappinessScoreFinder();
    HappinessDataReader happinessDataReader = new HappinessDataReader();


    @Test
    void findFor() {
        HappinessRecord input1 = new HappinessRecord("Test", 1, 10.5);
        HappinessRecord input2 = new HappinessRecord("This", 2, 10.0);
        HappinessRecord input3 = new HappinessRecord("Is", 3, 2.3);
        List<HappinessRecord> inputList = List.of(input1, input2, input3);
        String inputCountry = "Is";
        Optional<Double> expected = Optional.of(2.3);
        Optional<Double> result = happinessScoreFinder.findFor(inputList, inputCountry);
        Assertions.assertEquals(expected,result);
    }


    @Test
    void findForShouldReturnEmptyOptional() {
        HappinessRecord input1 = new HappinessRecord("Test", 1, 10.5);
        HappinessRecord input2 = new HappinessRecord("This", 2, 10.0);
        HappinessRecord input3 = new HappinessRecord("Is", 3, 2.3);
        List<HappinessRecord> inputList = List.of(input1, input2, input3);
        String inputCountry = "Austria";
        Optional<Double> expected = Optional.empty();
        Optional<Double> result = happinessScoreFinder.findFor(inputList, inputCountry);
        Assertions.assertEquals(expected,result);
    }

}