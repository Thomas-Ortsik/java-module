package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class AverageWriterTest {
    AverageWriter averageWriter = new AverageWriter();
    FileReader reader = new FileReader();


    String inputPath = "src/academy/everyonecodes/java/evaluation1/files/numbers.txt";
    String outputPath = "src/academy/everyonecodes/java/evaluation1/files/averages.txt";
    String expectedPath = "src/academy/everyonecodes/java/evaluation1/files/averages_expected.txt";


    @Test
    void write() {
        averageWriter.write(inputPath, outputPath);
        List<String> expected = reader.read(expectedPath);
        List<String> result = reader.read(outputPath);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void average(){
        List<Integer> input = List.of(10);
        Double expected = 10.0;
        Double result = averageWriter.average(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void average2(){
        List<Integer> input = List.of(10,0);
        Double expected = 5.0;
        Double result = averageWriter.average(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void average3(){
        List<Integer> input = List.of(10,5);
        Double expected = 7.5;
        Double result = averageWriter.average(input);
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void delete() {
        try {
            Files.delete(Path.of(outputPath));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}