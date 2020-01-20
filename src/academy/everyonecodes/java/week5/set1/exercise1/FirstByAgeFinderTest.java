package academy.everyonecodes.java.week5.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class FirstByAgeFinderTest {

    FirstByAgeFinder firstByAgeFinder = new FirstByAgeFinder();
    Person michael = new Person(53, "Michael");
    Person klara = new Person(27, "Klara");
    Person sue = new Person(34, "Sue");
    Person bob = new Person(27, "Bob");

    private List<Person> testList = List.of(michael, klara, sue, bob);

    @Test

    void findShouldReturnEmptyOptionalWithEmptyListAsInput(){
        List<Person> inputList = List.of();
        int inputAge = 16;
        Optional<Person> expected = Optional.empty();
        Optional<Person> result = firstByAgeFinder.find(testList, inputAge);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findShouldReturnEmptyOptional(){
        List<Person> inputList = testList;
        int inputAge = 16;
        Optional<Person> expected = Optional.empty();
        Optional<Person> result = firstByAgeFinder.find(testList, inputAge);
        Assertions.assertEquals(expected, result);
    }

    @Test

    void findShouldReturnMichael(){
        List<Person> inputList = testList;
        int inputAge = 53;
        Optional<Person> expected = Optional.of(michael);
        Optional<Person> result = firstByAgeFinder.find(testList, inputAge);
        Assertions.assertEquals(expected, result);
    }
@Test

    void findShouldReturnKlara(){
        List<Person> inputList = testList;
        int inputAge = 27;
        Optional<Person> expected = Optional.of(klara);
        Optional<Person> result = firstByAgeFinder.find(testList, inputAge);
        Assertions.assertEquals(expected, result);
    }


}