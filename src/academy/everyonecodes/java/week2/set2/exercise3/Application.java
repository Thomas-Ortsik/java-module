package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        HikerGatherer hikerGatherer = new HikerGatherer();
        Hike hike = new Hike("02.04.2020", hikerGatherer.gather());
        HikeDisplayer hikeDisplayer = new HikeDisplayer();
        hikeDisplayer.display(hike);
    }
}
