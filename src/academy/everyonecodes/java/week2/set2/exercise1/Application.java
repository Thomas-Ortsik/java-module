package academy.everyonecodes.java.week2.set2.exercise1;

public class Application {
    public static void main(String[] args) {
        Article article = new Article("Hello World", "This is a Hello World message. It's a bit late maybe, since traditionally we do that as a first exercise, but in this case i think it's fine to have it here... mostly because i'm kinda unimaginative right now.");
        Printer printer = new Printer();
        printer.print(article);
    }
}
