package academy.everyonecodes.java.evaluation2.exercises.exercise4.analyser;

import academy.everyonecodes.java.evaluation2.exercises.exercise4.AvocadoEntry;
import academy.everyonecodes.java.evaluation2.exercises.exercise4.analyser.AvocadoAnalyser;

import java.util.Comparator;
import java.util.List;

public class RegionOfMostSoldOrganicAnalyser implements AvocadoAnalyser {
    @Override
    public String analyse(List<AvocadoEntry> entries) {
        return "Region of most sold organic is: " + entries.stream()
                .filter(avocadoEntry -> avocadoEntry.getType().equals("organic"))
                .filter(avocadoEntry -> !avocadoEntry.getRegion().equals("TotalUS"))
                .sorted(Comparator.comparing(AvocadoEntry::getTotalSold).reversed())
                .map(avocadoEntry -> avocadoEntry.getRegion() + " with " + avocadoEntry.getTotalSold())
                .findFirst().orElse("Result not found");
    }
}
