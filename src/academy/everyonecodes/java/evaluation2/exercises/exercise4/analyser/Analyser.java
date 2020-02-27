package academy.everyonecodes.java.evaluation2.exercises.exercise4.analyser;

import academy.everyonecodes.java.evaluation2.exercises.exercise4.AvocadoEntry;

import java.util.List;
import java.util.stream.Collectors;

public class Analyser {
    public List<String> analyse(List<AvocadoEntry> entries) {
        List<AvocadoAnalyser> analysers = List.of(new LowestAveragePriceAnalyser(), new RegionOfMostSoldOrganicAnalyser());
        return analysers.stream()
                .map(result -> result.analyse(entries))
                .collect(Collectors.toList());
    }
}
