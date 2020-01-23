package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpotifyDataReaderTest {
    SpotifyDataReader spotifyDataReader = new SpotifyDataReader();

    private boolean songTester(Song expected, Song result) {
        boolean sameTitle = expected.getTitle().equals(result.getTitle());
        boolean sameRank = expected.getRank() == result.getRank();
        boolean sameName = expected.getName().equals(result.getName());
        if (sameName && sameRank && sameTitle) {
            return true;
        }
        return false;
    }

    @Test
    void read() {
        List<Song> resultList = spotifyDataReader.read();
        Song expectedSecond = new Song("China", 2, "Anuel AA");

        Assertions.assertTrue(songTester(expectedSecond, resultList.get(1)));

    }

    @Test
    void readShouldReturnRank49() {
        List<Song> resultList = spotifyDataReader.read();
        Song expectedSecondToLast = new Song("Call You Mine", 49, "The Chainsmokers");
        Assertions.assertTrue(songTester(expectedSecondToLast, resultList.get(1)));

    }
}