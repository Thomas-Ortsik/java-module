package academy.everyonecodes.java.christmas.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Organiser organiser = new Organiser();
        List<String> files = organiser.getAllPhotoFileNames();
        List<String> pngs = new ArrayList<>();
        for (String file:files) {
            pngs.add(organiser.generateNewName(file));
        }

    }
}
