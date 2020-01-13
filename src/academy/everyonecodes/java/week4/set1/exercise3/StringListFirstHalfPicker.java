package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringListFirstHalfPicker {
    /* WRONG PROGRAM BEHAVIOUR BUT I LIKE MY CODE SO I KEEP IT IN. SUE ME!

    public String pick(List<String> input){
        ArrayList<String> arrayInput = new ArrayList<>(input);
        Random random = new Random();
        int sizeNewList = input.size()/2;
        String returnString = "";
        while (sizeNewList > 0){
            int randomIndex = random.nextInt(sizeNewList);
            returnString = returnString + " " + arrayInput.get(randomIndex);
            arrayInput.remove(randomIndex);
            sizeNewList--;

        }
        return returnString;
    }
     */

    public String pick(List<String> input){
        Random random = new Random();
        int sizeHalfList = input.size()/2;
        int randomIndex = random.nextInt(sizeHalfList);
        return input.get(randomIndex);
    }
}
