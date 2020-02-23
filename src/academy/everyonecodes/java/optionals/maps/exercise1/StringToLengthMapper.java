package academy.everyonecodes.java.optionals.maps.exercise1;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToLengthMapper {
    public Map<String, Integer> map(List<String> arguments) {
        return arguments.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
    }
}
