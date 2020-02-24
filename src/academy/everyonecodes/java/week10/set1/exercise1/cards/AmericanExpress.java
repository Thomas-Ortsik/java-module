package academy.everyonecodes.java.week10.set1.exercise1.cards;

import java.util.List;

public class AmericanExpress implements Provider {
    @Override
    public String getProvider(long number) {
        if (isValidAmericanExpress(number)) {
            return "AMERICAN EXPRESS";
        }
        return "INVALID";
    }

    private boolean isValidAmericanExpress(long number) {
        String numberAsString = String.valueOf(number);
        int length = numberAsString.length();
        int firstTwoDigits = Integer.parseInt(numberAsString.substring(0, 2));
        List<Integer> validStartNumbers = List.of(34, 37);
        return length == 15 && validStartNumbers.contains(firstTwoDigits);
    }
}
