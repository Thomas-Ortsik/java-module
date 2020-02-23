package academy.everyonecodes.java.optionals.sets.exercise1;

import java.util.*;

public class IntegerListDuplicateRemover {
    public List<Integer> remove(List<Integer> input) {
        Set<Integer> set = new LinkedHashSet<>(input);
        return new ArrayList<>(set);
    }
}
