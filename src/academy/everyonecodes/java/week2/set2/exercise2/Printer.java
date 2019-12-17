package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;

public class Printer {
    public void print(Magazine magazine){
        System.out.println(magazine.getTitle()+"\n");
        for (Article article : magazine.getArticles()){
            System.out.println(article.getTitle() + "\n" + article.getText()+"\n");
        }
    }
}
