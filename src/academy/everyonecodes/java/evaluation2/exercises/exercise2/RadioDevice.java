package academy.everyonecodes.java.evaluation2.exercises.exercise2;

import academy.everyonecodes.java.evaluation2.exercises.exercise2.antennae.Antenna3G;
import academy.everyonecodes.java.evaluation2.exercises.exercise2.antennae.Antenna5G;
import academy.everyonecodes.java.evaluation2.exercises.exercise2.antennae.RadioAntenna;

import java.util.List;
import java.util.Optional;

public class RadioDevice {
    private List<RadioAntenna> antennae = List.of(new Antenna3G(), new Antenna5G());


    public Optional<String> receive(RadioMessage radioMessage) {
        return antennae.stream()
                .filter(antenna -> antenna.getFrequency() == radioMessage.getFrequency())
                .map(message -> radioMessage.getContent())
                .findFirst();

    }
}
