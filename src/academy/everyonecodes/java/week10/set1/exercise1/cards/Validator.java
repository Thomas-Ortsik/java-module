package academy.everyonecodes.java.week10.set1.exercise1.cards;

import java.util.List;

public class Validator {
    public boolean isValid(long number) {
        List<String> numberAsString = List.of(String.valueOf(number).split(""));
        long total = 0;
        boolean mustMultiply = false;
        for (int i = numberAsString.size() - 1; i >= 0; i--) {
            number = Long.parseLong(numberAsString.get(i));
            if (mustMultiply) {
                number = number * 2;
                number = getDigitSum(number);
            }
            mustMultiply = !mustMultiply;
            total += number;
        }
        return total % 10 == 0;
    }

    private long getDigitSum(long number) {
        String numAsString = String.valueOf(number);
        List<String> digits = List.of(numAsString.split(""));
        return digits.stream()
                .map(Long::valueOf)
                .reduce((long) 0, Long::sum);
    }
}
