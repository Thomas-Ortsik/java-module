package academy.everyonecodes.java.week5.set2.exercise6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SpotifyDataReader {

    public List<Song> read() {
        SpotifyDataParser spotifyDataParser = new SpotifyDataParser();
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/files/spotify-top-50.csv");
        List<String> toParse = new ArrayList<>();
        List<Song> songs = new ArrayList<>();
        try {
            toParse = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            toParse = List.of();
        }
        for (String line : toParse
        ) {
            Optional<Song> parsed = spotifyDataParser.parseLine(line);
            if (parsed.isPresent()) {
                songs.add(parsed.get());
            }

        }
        return songs;
    }
}