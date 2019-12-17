package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

import java.util.List;

public class Editor {
    public Magazine writeMagazine(){
        Article article1 = new Article("Headline","This is the body.");
        Article article2 = new Article("Ads", "Someone has to pay for this.");
        Article article3 = new Article("Readermail", "This is lazy content, but it keeps you engaged");
        Magazine magazine = new Magazine("Daily Driver", List.of(article1, article2, article3));
        return magazine;
    }
}
