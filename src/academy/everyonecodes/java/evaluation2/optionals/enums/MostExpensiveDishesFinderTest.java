package academy.everyonecodes.java.evaluation2.optionals.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class MostExpensiveDishesFinderTest {
    MostExpensiveDishesFinder finder = new MostExpensiveDishesFinder();

    static Stream<Arguments> menuMaker() {
        return Stream.of(
                Arguments.of(List.of(
                        new Dish("exp1", Category.STARTER, 20.0),
                        new Dish("exp2", Category.MAIN, 25.5),
                        new Dish("exp3", Category.DESSERT, 15.2)),
                        List.of(
                                new Dish("exp1", Category.STARTER, 20.0),
                                new Dish("exp2", Category.MAIN, 25.5),
                                new Dish("exp3", Category.DESSERT, 15.2),
                                new Dish("chp1", Category.STARTER, 10.0),
                                new Dish("chp2", Category.MAIN, 3.4),
                                new Dish("chp3", Category.DESSERT, 2.0))),
                Arguments.of(List.of(
                        new Dish("chp1", Category.STARTER, 10.5),
                        new Dish("chp2", Category.MAIN, 25.4),
                        new Dish("chp3", Category.DESSERT, 15.5)),
                        List.of(
                                new Dish("exp1", Category.STARTER, 10.0),
                                new Dish("exp2", Category.MAIN, 25.0),
                                new Dish("exp3", Category.DESSERT, 15.2),
                                new Dish("chp1", Category.STARTER, 10.5),
                                new Dish("chp2", Category.MAIN, 25.4),
                                new Dish("chp3", Category.DESSERT, 15.5))));

    }

    @ParameterizedTest
    @MethodSource("menuMaker")
    void find(List<Dish> expected, List<Dish> input) {
        List<Dish> result = finder.find(input);
        Assertions.assertEquals(expected, result);
    }

}