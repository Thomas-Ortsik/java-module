package academy.everyonecodes.java.week8.set1.exercise2;

import academy.everyonecodes.java.week8.set1.exercise1.CircleShaper;
import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static org.junit.jupiter.api.Assertions.*;

public class ShaperTest {

    Shaper circleShaper = new CircleShaper();
    Shaper squareShaper = new SquareShaper();
    Shaper triangleShaper = new TriangleShaper();
    List<Shaper> shapers = List.of(circleShaper, squareShaper, triangleShaper);

    @Test

    void getShapeFromAListOfShapers(){
        List<String> expected = List.of("Circle", "Square", "Triangle");
        List<String> result = shapers.stream()
                .map(Shaper::getShape)
                .collect(toList());
        assertEquals(expected, result);
    }
}
