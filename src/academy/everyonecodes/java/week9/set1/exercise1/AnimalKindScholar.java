package academy.everyonecodes.java.week9.set1.exercise1;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalKindScholar {
    private AnimalTypeFinder finder = new AnimalTypeFinder();
    public String elaborate(String nameOrKind) {
        List<Animals> animalsList = Animals.get();
        Optional<String> type = finder.getType(nameOrKind, animalsList);
        if (type.isEmpty()) {
            return "not an animal";
        }
        if (type.get().equals("name")) {
            return getKind(nameOrKind, animalsList);
        }
        if (type.get().equals("kind")) {
            return getNames(nameOrKind, animalsList);
        }
        return "not an animal";
    }

    private String getNames(String nameOrKind, List<Animals> animalsList) {
        return animalsList.stream()
                .filter(animals -> animals.getKind().equals(nameOrKind))
                .map(Animals::getName)
                .sorted()
                .collect(Collectors.joining(", "));
    }

    private String getKind(String nameOrKind, List<Animals> animalsList) {
        return animalsList.stream()
                .filter(animals -> animals.getName().equals(nameOrKind))
                .map(Animals::getKind)
                .collect(Collectors.joining());
    }

}