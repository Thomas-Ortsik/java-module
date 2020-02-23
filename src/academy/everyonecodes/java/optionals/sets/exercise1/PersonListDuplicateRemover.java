package academy.everyonecodes.java.optionals.sets.exercise1;

import java.util.*;

public class PersonListDuplicateRemover {
    public List<Person> remove(List<Person> persons) {
    Set<Person> set = new LinkedHashSet<>(persons);
    return new ArrayList<>(set);
    }
}
