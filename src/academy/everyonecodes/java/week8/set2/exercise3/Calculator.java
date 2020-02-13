package academy.everyonecodes.java.week8.set2.exercise3;

import academy.everyonecodes.java.week8.set2.exercise3.operators.Operators;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Calculator {
    private List<Character> availableOperators = Operators.get();

    public Optional<Double> calculate(String calculation) {
        calculation = calculation.replaceAll(" ", "");
        Optional<Character> oOperator = findOperator(calculation);
        if (oOperator.isEmpty()) {
            return Optional.empty();
        }
        Character operator = oOperator.get();
        List<Double> numbers = getNumbers(calculation, operator);
        if (numbers.size() != 2) {
            return Optional.empty();
        }
        double number1 = numbers.get(0);
        double number2 = numbers.get(1);
        switch (operator) {
            case '+':
                return Optional.of(number1 + number2);
            case '-':
                return Optional.of(number1 - number2);
            case '*':
                return Optional.of(number1 * number2);
            case '/':
                return Optional.of(number1 / number2);

        }
        return Optional.empty();
    }


    private Optional<Character> findOperator(String calculation) {
        return availableOperators.stream()
                .filter(operator -> isUsed(operator, calculation))
                .findFirst();
    }

    private boolean isUsed(Character operator, String calculation) {
        return calculation.contains(String.valueOf(operator));
    }

    // I now know why we haven't really used Character so far. Thought this might be a good scenario for using it.
        //...
            //...
                //...I was wrong.

    //also time is running out, so i will not make the code nice and clean.
    //instead I do what I imagine every self respecting coder would do in this situation:
    //just duct tape a solution together and hope it works.

    private List<Double> getNumbers(String calculation, Character operator) {
        String operatorAsString;

        //if you know a way to not do the following lines of code when using Characters, let me know.
        if (operator.equals('*')) {
            operatorAsString = "\\*";
        } else if (operator.equals('+')) {
            operatorAsString = "\\+";
        } else {
            operatorAsString = String.valueOf(operator);
        }
        return List.of(calculation.split(operatorAsString)).stream()
                .map(Double::valueOf)
                .collect(Collectors.toList());
    }
}
