package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;
import java.util.stream.Stream;

public class StudentPerformanceParser {
    public StudentPerformance parseLine(String input) {
        List<String> splitLine = List.of(input.split(";"));
        return new StudentPerformance(
                splitLine.get(0),  //gender
                splitLine.get(1),  //parentalEducation
                Integer.parseInt(splitLine.get(2)), //mathScore
                Integer.parseInt(splitLine.get(3)), //readingScore
                Integer.parseInt(splitLine.get(4)) //writingScore
        );


    }
}
