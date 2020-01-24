package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;

public class LinesCalculator {
    public List<Integer> calculate(List<String> numbers){
        StringToIntegersParser stringToIntegersParser = new StringToIntegersParser();
        IntegerListSumCalculator integerListSumCalculator = new IntegerListSumCalculator();
        List<Integer> intNumbers = new ArrayList<>();
        for (String stringNumber:numbers
             ) {
            List<Integer> intsToSum = stringToIntegersParser.parse(stringNumber);
            intNumbers.add(integerListSumCalculator.sum(intsToSum));
        }
        return intNumbers;
    }
}
