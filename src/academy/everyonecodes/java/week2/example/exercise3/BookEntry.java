package academy.everyonecodes.java.week2.example.exercise3;

public class BookEntry {
    private String title;
    private String author;
    private int yearOfPublication;

    public BookEntry(String title, String author, int yearOfPublication){
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }
}
