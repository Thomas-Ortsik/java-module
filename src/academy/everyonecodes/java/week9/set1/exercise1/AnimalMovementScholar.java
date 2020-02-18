package academy.everyonecodes.java.week9.set1.exercise1;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animals;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalMovementScholar {
    private AnimalTypeFinder finder = new AnimalTypeFinder();
    private List<Animals> animalsList = Animals.get();

    public String elaborate(String nameOrKind){

        Optional<String> type = finder.getType(nameOrKind, animalsList);
        if (type.isPresent()){
            if (type.get().equals("kind")){
                return movementTypes(nameOrKind);
            }
            if (type.get().equals("name")){
                return animalsList.stream()
                        .filter(animals -> animals.getName().equals(nameOrKind))
                        .map(animals -> animals.getMovement().stream().collect(Collectors.joining(", ")))
                        .collect(Collectors.joining());
            }
        }
        return "not an animal";

    }

    private String movementTypes(String kind){
        return animalsList.stream()
                .filter(animals -> animals.getKind().equals(kind))
                .flatMap(animals -> animals.getMovement().stream())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
