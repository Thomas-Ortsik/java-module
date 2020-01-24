package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.set2.exercise7.IntegerListToStringListConverter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SumWriter {

    public void write() {
        LinesCalculator linesCalculator = new LinesCalculator();
        IntegerListToStringListConverter integerListToStringListConverter = new IntegerListToStringListConverter();
        Path pathInput = Path.of("src/academy/everyonecodes/java/week5/reflection/files/input.csv");
        Path pathOutput = Path.of("src/academy/everyonecodes/java/week5/reflection/files/output.csv");
        List<String> inputString = new ArrayList<>();
        try {
            inputString = Files.readAllLines(pathInput);
        } catch (IOException e) {
            inputString = List.of();
            e.printStackTrace();
        }
        List<Integer> listInts = linesCalculator.calculate(inputString);
        List<String> notime = integerListToStringListConverter.convert(listInts);
         try {
            Files.write(pathOutput, notime);
        }catch (IOException e){e.printStackTrace();}
    }

}
