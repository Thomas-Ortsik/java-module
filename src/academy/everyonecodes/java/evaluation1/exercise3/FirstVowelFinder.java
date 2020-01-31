package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;
import java.util.Optional;

public class FirstVowelFinder {
    public Optional<String> find(String input) {
        List<String> vowels = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
        for (int i = 0; i < input.length(); i++) {
            String letter = input.substring(i, i + 1);
            if (vowels.contains(letter)) {
                return Optional.of(letter);
            }
        }
        return Optional.empty();
    }
}
