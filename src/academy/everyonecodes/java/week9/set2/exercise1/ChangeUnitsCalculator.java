package academy.everyonecodes.java.week9.set2.exercise1;

import academy.everyonecodes.java.week9.set2.exercise1.units.MoneyUnit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChangeUnitsCalculator {
    public List<MoneyUnit> calculate(double input) {
        List<MoneyUnit> returnUnits = new ArrayList<>();
        while (input > 0) {
            Optional<MoneyUnit> oSingleChange = getHighestPossibleBill(input);
            if (oSingleChange.isPresent()) {
                MoneyUnit singleChange = oSingleChange.get();
                returnUnits.add(singleChange);
                input = BigDecimal.valueOf(input)
                        .subtract(BigDecimal.valueOf(singleChange.getValue()))
                        .doubleValue();
            }
        }
        return returnUnits;
    }

    private Optional<MoneyUnit> getHighestPossibleBill(double moneyLeft) {
        return EuroUnits.get().stream()
                .filter(euroUnit -> euroUnit.getValue() <= moneyLeft)
                .findFirst();
    }

}

