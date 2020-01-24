package academy.everyonecodes.java.week5.reflection.exercise1;

import java.util.Optional;

public class LetterPositionFinder {

    public Optional<Integer> find(String word, String letter){
        word = word.toLowerCase();
        for (int i = 0; i < word.length() ; i++) {
            if (word.substring(i, i+1).equals(letter)){
                return Optional.of(i);
            }
        }return  Optional.empty();
    }
}
