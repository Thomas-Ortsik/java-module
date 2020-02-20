package academy.everyonecodes.java.week9.set2.exercise1;

import academy.everyonecodes.java.week9.set2.exercise1.units.*;
import org.junit.jupiter.api.Test;

import java.util.List;

class ChangeUnitsCalculatorTest {
    ChangeUnitsCalculator calculator = new ChangeUnitsCalculator();


    @Test

    void calculate(){
        double input = 526.84;
        List<MoneyUnit> expected = List.of(new Euro200(), new Euro200(), new Euro100(), new Euro20(), new Euro5(), new Euro1(), new Cent50(), new Cent20(), new Cent10(), new Cent2(), new Cent2());
        List<MoneyUnit> result = calculator.calculate(input);
    }

    @Test

    void calculate2(){
        double input = 555.55;
        List<MoneyUnit> expected = List.of(new Euro200(), new Euro200(), new Euro100(), new Euro50(), new Euro5(), new Cent50(), new Cent5());
        List<MoneyUnit> result = calculator.calculate(input);
    }

}