package academy.everyonecodes.java.week2.example.exercise3;

import java.util.List;

public class Library {
    private String name;
    private List<BookEntry> bookEntries;

    public Library(String name, List<BookEntry> bookEntries){
        this.name = name;
        this.bookEntries = bookEntries;
    }
    public String getName(){
        return name;
    }
    public List<BookEntry> getBookEntries(){
        return bookEntries;
    }
}
