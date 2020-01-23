package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HappinessDataParserTest {
    HappinessDataParser happinessDataParser = new HappinessDataParser();
    HappinessRecordTest happinessRecordTest = new HappinessRecordTest();


    @Test

    void parseLine(){
        String input = "Test;1;1.00";
        Optional<HappinessRecord> oExpected = Optional.of(new HappinessRecord("Test",1,1.00));
        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);
        Assertions.assertTrue(happinessRecordTest.oHappinessRecordAttributeTester(oExpected, oResult));
    }


    @Test

    void parseLineShouldBeEmpty(){
        String input = "";
        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);
        Assertions.assertTrue(oResult.isEmpty());
    }


    @Test

    void parseLineAgain(){
        String input = "Test23;34;1.50";
        Optional<HappinessRecord> oExpected = Optional.of(new HappinessRecord("Test23",34,1.50));
        Optional<HappinessRecord> oResult = happinessDataParser.parseLine(input);
        Assertions.assertTrue(happinessRecordTest.oHappinessRecordAttributeTester(oExpected, oResult));
    }
}