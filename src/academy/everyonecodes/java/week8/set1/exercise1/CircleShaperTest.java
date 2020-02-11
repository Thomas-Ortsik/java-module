package academy.everyonecodes.java.week8.set1.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleShaperTest {

    String expected = "Circle";
    CircleShaper circleShaper = new CircleShaper();
    Shaper shaper = circleShaper;
    Shaper anotherShaper = new CircleShaper();

    @Test
    void getShapeWithCircleShaper() {

        String result = circleShaper.getShape();
        assertEquals(expected, result);
    }

    void getShapeWithShaper() {
        String result = shaper.getShape();
        assertEquals(expected, result);
    }

    void getShapeWithAnotherShaper(){
        String result = anotherShaper.getShape();
        assertEquals(expected, result);
    }



}