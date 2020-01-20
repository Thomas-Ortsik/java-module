package academy.everyonecodes.java.week5.set1.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StringOverlapFinder {

    public Optional<String> find(String nameOne, String nameTwo) {
        int sizeNameOne = nameOne.length();
        int sizeNameTwo = nameTwo.length();
        nameOne = nameOne.toLowerCase();
        nameTwo = nameTwo.toLowerCase();
        String optionA = checkCombination(nameOne, nameTwo);
        String optionB = checkCombination(nameTwo, nameOne);
        int sizeOptionA = optionA.length();
        int sizeOptionB = optionB.length();
        if (sizeOptionA == 0 && sizeOptionB == 0) {
            return Optional.empty();
        }
        if (sizeOptionA > sizeOptionB) {
            return Optional.of(optionA);
        }
        return Optional.of(optionB);


    }

    private String checkCombination(String nameOne, String nameTwo) {
        for (int i = 0; i < nameTwo.length(); i++) {
            if (nameOne.startsWith(nameTwo.substring(i))) {
                return nameTwo.substring(i);
            }


        }

        return "";
    }
}