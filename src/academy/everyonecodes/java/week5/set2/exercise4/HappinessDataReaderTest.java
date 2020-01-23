package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HappinessDataReaderTest {
    HappinessDataReader happinessDataReader = new HappinessDataReader();
    HappinessRecordTest happinessRecordTest = new HappinessRecordTest();


    @Test

    void read(){
        List<HappinessRecord> resultList = happinessDataReader.read();
        int resultSize = resultList.size();
        int expectedSize = 156;
        HappinessRecord expectedLastEntry = new HappinessRecord("Ireland", 15, 6.97700023651123);
        HappinessRecord expectedFirstEntry = new HappinessRecord("INVALID ENTRY", -1,0.00);
        HappinessRecord resultLastEntry = resultList.get(resultSize-1);
        HappinessRecord resultFirstEntry = resultList.get(0);

        Assertions.assertEquals(expectedSize, resultSize);
        Assertions.assertTrue(happinessRecordTest.happinessRecordAttributeTester(expectedFirstEntry, resultFirstEntry));
        Assertions.assertTrue(happinessRecordTest.happinessRecordAttributeTester(expectedLastEntry, resultLastEntry));

    }

}


//check for amount of lines and if first and last are the same