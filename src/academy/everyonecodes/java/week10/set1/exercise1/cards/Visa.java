package academy.everyonecodes.java.week10.set1.exercise1.cards;

import java.util.List;

public class Visa implements Provider {
    @Override
    public String getProvider(long number) {
        if (isValidVisa(number)) {
            return "VISA";
        }
        return "INVALID";
    }

    private boolean isValidVisa(long number) {
        String numberAsString = String.valueOf(number);
        int length = numberAsString.length();
        int firstDigit = Integer.parseInt(numberAsString.substring(0, 1));
        List<Integer> validLengths = List.of(13, 16);
        return firstDigit == 4 && validLengths.contains(length);
    }
}




