package academy.everyonecodes.java.week9.set1.exercise1;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalTypeFinder {



    public Optional<String> getType(String nameOrKind, List<Animals> animalsList) {
        return animalsList.stream()
                .map(animals -> findType(animals, nameOrKind))
                .filter(animals -> animals.equals("kind") || animals.equals("name"))
                .findFirst();
    }

//probably should have done the next method with an optional boolean instead.
    private String findType(Animals animal, String nameOrKind) {
        if (animal.getKind().equals(nameOrKind)) {
            return "kind";
        }
        if (animal.getName().equals(nameOrKind)) {
            return "name";
        }
        return "neither";
    }
}
