package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentPerformanceParserTest {
    StudentPerformanceParser parser = new StudentPerformanceParser();

    @Test
    void parseLine() {
        String input = "male;associate's degree;40;52;43";
        StudentPerformance expected = new StudentPerformance("male", "associate's degree", 40, 52, 43);
        StudentPerformance result = parser.parseLine(input);
        assertEquals(expected, result);
    }

}