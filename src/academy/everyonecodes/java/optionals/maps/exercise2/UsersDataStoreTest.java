package academy.everyonecodes.java.optionals.maps.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class UsersDataStoreTest {
    UsersDataStore dataStore = new UsersDataStore();

    static Stream<Arguments> makeDemUsers() {
        return Stream.of(
                Arguments.of(Optional.of(new User("dagobert", "duck")), "dagobert"),
                Arguments.of(Optional.of(new User("donald", "workingClassHero")), "donald"),
                Arguments.of(Optional.empty(), "trick"));
    }

    @ParameterizedTest
    @MethodSource("makeDemUsers")

    void getUsersByUsername(Optional<User> oExpected, String input){
        Optional<User> oResult = dataStore.getUserByUsername(input);
        Assertions.assertEquals(oExpected, oResult);
    }
}