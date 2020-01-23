package academy.everyonecodes.java.week5.set2.exercise7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineLengthWriter {

    public void write(){
        LineLengthReader lineLengthReader = new LineLengthReader();
        IntegerListToStringListConverter integerListToStringListConverter = new IntegerListToStringListConverter();
        List<Integer> integers = lineLengthReader.read();
        List<String> strings = integerListToStringListConverter.convert(integers);
        try {
            Files.write(Path.of("src/academy/everyonecodes/java/week5/set2/files/stringlengths.txt"), strings);
        }catch (IOException e){e.printStackTrace();}

    }
}
