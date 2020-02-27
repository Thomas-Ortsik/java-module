package academy.everyonecodes.java.evaluation2.exercises.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumberNameShifter {
    private NumberNamesDictionary dictionary = new NumberNamesDictionary();

    public List<String> shift(List<String> numbers) {
        return numbers.stream()
                .map(number -> dictionary.getNumber(number))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(number -> number <9)
                .map(number -> number+1)
                .map(dictionary::getName)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }
}
