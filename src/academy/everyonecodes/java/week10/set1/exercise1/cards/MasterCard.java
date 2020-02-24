package academy.everyonecodes.java.week10.set1.exercise1.cards;

import java.util.List;

public class MasterCard implements Provider {
    @Override
    public String getProvider(long number) {
        if (isValidMasterCard(number)) {
            return "MASTERCARD";
        }
        return "INVALID";
    }

    private boolean isValidMasterCard(long number) {
        String numberAsString = String.valueOf(number);
        int length = numberAsString.length();
        int firstTwoDigits = Integer.parseInt(numberAsString.substring(0, 2));
        List<Integer> validStartNumbers = List.of(22, 51, 52, 53, 54, 55);
        return length == 16 && validStartNumbers.contains(firstTwoDigits);
    }
}
