package academy.everyonecodes.java.week6.set1.exercise4;

public class BlogChecker {
    public boolean hasBlog(Website website){
        if (website.getBlog().isEmpty()){
            return false;
        }
        return true;
    }
}
