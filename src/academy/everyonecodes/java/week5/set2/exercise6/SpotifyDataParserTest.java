package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SpotifyDataParserTest {
    SpotifyDataParser spotifyDataParser = new SpotifyDataParser();


    private boolean oSongTester(Song expected, Optional<Song> oResult) {
        Song result = oResult.orElseGet(() -> new Song("INVALID", 0, "INVALID"));
        boolean sameTitle = expected.getTitle().equals(result.getTitle());
        boolean sameRank = expected.getRank() == result.getRank();
        boolean sameName = expected.getName().equals(result.getName());
        if (sameTitle && sameName && sameRank){return true;}
        return false;
    }

    @Test
    void parseLine() {
        String input = "2;\"China\";\"Anuel AA\";reggaeton flow;105;81;79;-4;8;61;302;8;9;92";
        Song expected = new Song("China", 2, "Anuel AA");
        Optional<Song> result = spotifyDataParser.parseLine(input);
        Assertions.assertTrue(oSongTester(expected, result));

    }

    @Test
    void parseLineShouldReturnEmpty() {
        String input = "2";
        Optional<Song> result = spotifyDataParser.parseLine(input);
        Assertions.assertTrue(result.isEmpty());

    }

    @Test
    void parseLineShouldAlsoReturnEmpty() {
        String input = "fkflk;flkllf;fdklklfd;klfdlkl;fdlklk;lklfkdklf;";
        Song expected = new Song("China", 2, "Anuel AA");
        Optional<Song> result = spotifyDataParser.parseLine(input);
        Assertions.assertTrue(result.isEmpty());

    }

}