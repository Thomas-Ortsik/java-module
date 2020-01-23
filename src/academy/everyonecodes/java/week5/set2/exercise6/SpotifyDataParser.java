package academy.everyonecodes.java.week5.set2.exercise6;

import java.util.Optional;

public class SpotifyDataParser {

    public Optional<Song> parseLine(String listEntry){
        listEntry = listEntry.replaceAll("\"","");
        String[] songDetails = listEntry.split(";");
        try {
            return Optional.of(new Song(songDetails[1], Integer.valueOf(songDetails[0]), songDetails[2]));
        } catch (NumberFormatException e){
            return Optional.empty();
        }
    }

}
