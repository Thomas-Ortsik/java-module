package academy.everyonecodes.java.optionals.sets.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListDuplicateRemoverTest {
    IntegerListDuplicateRemover remover = new IntegerListDuplicateRemover();

    static Stream<Arguments> listGenerator(){
        return Stream.of(
                Arguments.of(List.of(1,2,3,4,4,2,1), List.of(1,2,3,4)),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(1,1,1,1), List.of(1)),
                Arguments.of(List.of(-1,1,0,0),List.of(-1,1,0)),
                Arguments.of(List.of(4,1,2,5,6,2), List.of(4,1,2,5,6))
        );
    }

    @ParameterizedTest
    @MethodSource ("listGenerator")

    void remove(List<Integer> expected, List<Integer> input){
        List<Integer> result = remover.remove(input);
    }

}