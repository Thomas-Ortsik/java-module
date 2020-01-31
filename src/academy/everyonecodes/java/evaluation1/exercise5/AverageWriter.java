package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.FileReader;
import academy.everyonecodes.java.evaluation1.FileWriter;
import academy.everyonecodes.java.evaluation1.StringToIntegersParser;

import java.util.ArrayList;
import java.util.List;

public class AverageWriter {
    FileReader reader = new FileReader();
    FileWriter writer = new FileWriter();
    StringToIntegersParser stringToIntegersParser = new StringToIntegersParser();

    public void write(String inputPath, String outputPath) {
        List<String> stringList = new ArrayList<>(reader.read(inputPath));
        List<Double> averagesList = new ArrayList<>();
        for (String line : stringList) {
            List<Integer> numbersOneLine = stringToIntegersParser.parse(line);
            averagesList.add(average(numbersOneLine));
        }
        stringList = doubleToString(averagesList);
        writer.write(outputPath, stringList);

    }


    private Double average(List<Integer> numbers) {
        int size = numbers.size();
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return 1.0 * sum / size;
    }

    private List<String> doubleToString(List<Double> numbers) {
        List<String> stringNumbers = new ArrayList<>();
        for (Double number : numbers) {
            stringNumbers.add(String.valueOf(number));
        }
        return stringNumbers;
    }

}
