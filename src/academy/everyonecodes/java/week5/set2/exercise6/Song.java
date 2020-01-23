package academy.everyonecodes.java.week5.set2.exercise6;

public class Song {
    private String title;
    private int rank;
    private String name;

    public String getTitle() {
        return title;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public Song(String title, int rank, String name) {
        this.title = title;
        this.rank = rank;
        this.name = name;
    }
}
