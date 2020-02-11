package academy.everyonecodes.java.week8.set1.exercise3;

import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleShaperTest {

    RectangleShaper rectangleShaper = new RectangleShaper();
    Colored colored = (Colored) rectangleShaper;
    Shaper shaper = (Shaper) rectangleShaper;
    List<RectangleShaper> rectangleShapers = List.of(rectangleShaper);
    List<Colored> coloreds = List.of(rectangleShaper, colored);
    List<Shaper> shapes = List.of(rectangleShaper, shaper);
    String expectedShape = "Rectangle";
    String expectedColor = "Green";

    @Test
    void rectangleShaper() {
        assertTrue(expectedShape.equals(rectangleShaper.getShape()) && expectedColor.equals(rectangleShaper.getColor()));
    }

    @Test
    void colored() {
        assertEquals(expectedColor, colored.getColor());
    }

    @Test
    void shaper() {
        assertEquals(expectedShape, shaper.getShape());
    }

}

