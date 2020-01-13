package academy.everyonecodes.java.week4.set1.exercise1;

public class PngChecker {
    public boolean check(String fileName){
        if (fileName != null && fileName.toLowerCase().endsWith(".png")){
            return true;
        }
        return false;
    }
}
