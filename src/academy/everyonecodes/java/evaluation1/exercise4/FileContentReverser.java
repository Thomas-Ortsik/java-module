package academy.everyonecodes.java.evaluation1.exercise4;

import academy.everyonecodes.java.evaluation1.FileReader;
import academy.everyonecodes.java.evaluation1.FileWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileContentReverser {

    FileReader reader = new FileReader();
    FileWriter writer = new FileWriter();

    public void reverse(String inputPath, String outputPath) {

        List<String> inputList = new ArrayList<>(reader.read(inputPath));
        Collections.reverse(inputList);
        writer.write(outputPath, inputList);
    }
}
