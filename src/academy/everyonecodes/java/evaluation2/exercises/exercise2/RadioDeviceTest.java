package academy.everyonecodes.java.evaluation2.exercises.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RadioDeviceTest {
    RadioDevice radioDevice = new RadioDevice();

    static Stream<Arguments> radioStar() {
        return Stream.of(
                Arguments.of(Optional.of("test1"), new RadioMessage("test1", 1900)),
                Arguments.of(Optional.of("test1"), new RadioMessage("test1", 4200)),
                Arguments.of(Optional.of(""), new RadioMessage("", 1900)));
    }

    static Stream<Arguments> radioFlop() {
        return Stream.of(
                Arguments.of(new RadioMessage("test1", 3000)),
                Arguments.of(new RadioMessage("test1", -1900)),
                Arguments.of(new RadioMessage("test1", -4200)));
    }

    @ParameterizedTest
    @MethodSource("radioStar")
    void receive(Optional<String> oExpected, RadioMessage input) {
        Optional<String> oResult = radioDevice.receive(input);
        assertTrue(oResult.isPresent());
        assertEquals(oExpected.get(), oResult.get());
    }


    @ParameterizedTest
    @MethodSource("radioFlop")
    void receiveEmptyOptionals(RadioMessage input) {
        Optional<String> oResult = radioDevice.receive(input);
        assertTrue(oResult.isEmpty());
    }
}