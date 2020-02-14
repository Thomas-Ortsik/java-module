package academy.everyonecodes.java.week2.example.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        BookEntry ubik = new BookEntry("Ubik", "P.K. Dick", 1969);
        BookEntry scannerDarkly = new BookEntry("A Scanner Darkly", "P.K. Dick", 1977);
        BookEntry snowcrash = new BookEntry("Snowcrash", "Neal Stephenson", 1992);
        List<BookEntry> booksSetOne = List.of(ubik, scannerDarkly, snowcrash);
        Library everyoneReads = new Library("everyone reads", booksSetOne);
        for (BookEntry book : everyoneReads.getBookEntries()) {
            System.out.println(book.getTitle() + ", " + book.getAuthor());
        }
    }
}
