package academy.everyonecodes.java.evaluation2.exercises.exercise4.analyser;

import academy.everyonecodes.java.evaluation2.exercises.exercise4.AvocadoEntry;
import academy.everyonecodes.java.evaluation2.exercises.exercise4.analyser.AvocadoAnalyser;

import java.util.Comparator;
import java.util.List;

public class LowestAveragePriceAnalyser implements AvocadoAnalyser {
    @Override
    public String analyse(List<AvocadoEntry> entries) {
        return entries.stream()
                .sorted(Comparator.comparing(AvocadoEntry::getAveragePrice))
                .map(avocadoEntry -> "Lowest average price is: "+ avocadoEntry.getAveragePrice() + " on "+avocadoEntry.getYear())
                .findFirst().orElse("Lowest average price is: Result not found");

    }
}
