package academy.everyonecodes.java.week7.reflection.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StudentPerformanceReader {
    private StudentPerformanceParser parser = new StudentPerformanceParser();

    public List<StudentPerformance> read() {
        Path path = Path.of("src/academy/everyonecodes/java/week7/reflection/files/students-performance.csv");
        try {
            return Files.lines(path)
                    .skip(1)
                    .map(parser::parseLine)
                    .collect(toList());
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }
}
