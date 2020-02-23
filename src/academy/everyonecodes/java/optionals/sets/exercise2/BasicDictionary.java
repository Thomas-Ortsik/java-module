package academy.everyonecodes.java.optionals.sets.exercise2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicDictionary {
    private Set<String> dictionary;

    public BasicDictionary() {
        dictionary = Set.of("hi","house","dog","cat","table","chair","elephant");
    }

    public List<String> findUnknownWords(String sentence){
        LinkedHashSet<String> set = Arrays.stream(sentence.split(" "))
                .map(String::toLowerCase)
                .filter(word -> !dictionary.contains(word))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        return new ArrayList<>(set);

        //only doing it this way because Sets exercise. Otherwise .distinct and directly returning the stream as List would do it, right?
    }

}
