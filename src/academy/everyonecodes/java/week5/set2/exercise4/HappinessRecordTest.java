package academy.everyonecodes.java.week5.set2.exercise4;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HappinessRecordTest {
    public boolean happinessRecordAttributeTester(HappinessRecord expected, HappinessRecord result){
        boolean sameCountry = expected.getCountry().equals(result.getCountry());
        boolean sameRank = expected.getRank() == result.getRank();
        boolean sameScore = expected.getScore() == result.getScore();
        if (sameCountry && sameRank && sameScore) {return true;}
        return false;
    }

    public boolean oHappinessRecordAttributeTester(Optional<HappinessRecord> oExpected, Optional<HappinessRecord> oResult){
        HappinessRecord expected = oExpected.get();
        HappinessRecord result = oResult.get();
        return happinessRecordAttributeTester(expected, result);
    }
}