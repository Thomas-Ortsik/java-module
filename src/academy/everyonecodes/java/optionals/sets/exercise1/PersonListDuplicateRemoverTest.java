package academy.everyonecodes.java.optionals.sets.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class PersonListDuplicateRemoverTest {
    PersonListDuplicateRemover remover = new PersonListDuplicateRemover();

    static Stream<Arguments> personListGenerator() {
        return Stream.of(
                Arguments.of(List.of(new Person("John", 31),
                        new Person("Jake", 31),
                        new Person("John", 31),
                        new Person("John", 32)),
                        List.of(new Person("John", 31),
                                new Person("Jake", 31),
                                new Person("John", 32))),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(new Person("Martha", 59),
                        new Person("Martha", 59)),
                        List.of(new Person("Martha", 59))));
    }

    @ParameterizedTest
    @MethodSource("personListGenerator")

    void remove(List<Person> input, List<Person> expected){
        List<Person> result = remover.remove(input);
        Assertions.assertEquals(expected, result);
    }

}

