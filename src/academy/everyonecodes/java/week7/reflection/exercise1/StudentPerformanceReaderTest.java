package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentPerformanceReaderTest {
    StudentPerformanceReader reader = new StudentPerformanceReader();

    @Test

    void readTestWithMiddleOfList(){
        List<StudentPerformance> studentList = reader.read();
        StudentPerformance result = studentList.get(499);
        StudentPerformance expected = new StudentPerformance("male","some college",76, 71, 72);
        assertEquals(expected, result);
    }

}