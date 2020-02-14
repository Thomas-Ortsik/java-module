package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HappinessDataReaderTest {

    HappinessDataReader happinessDataReader = new HappinessDataReader();
    HappinessRecord expectedFirstEntry = new HappinessRecord("Lesotho", 139, 3.80800008773804);
    HappinessRecord expectedLastEntry = new HappinessRecord("Ireland", 15, 6.97700023651123);
    HappinessRecord expectedSeventyFifthEntry = new HappinessRecord("Greece", 87, 5.22700023651123);

    @Test
    void read() {
        List<HappinessRecord> result = happinessDataReader.read();
        HappinessRecord resultFirstEntry = result.get(0);
        HappinessRecord resultLastEntry = result.get(result.size() - 1);
        HappinessRecord resultSeventyFifthEntry = result.get(74);

        Assertions.assertTrue(expectedFirstEntry.equals(resultFirstEntry));
        Assertions.assertEquals(expectedLastEntry.hashCode(), resultLastEntry.hashCode());
        Assertions.assertTrue(expectedSeventyFifthEntry.equals(resultSeventyFifthEntry));
    }


}