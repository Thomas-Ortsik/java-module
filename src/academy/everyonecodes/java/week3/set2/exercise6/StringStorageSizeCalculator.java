package academy.everyonecodes.java.week3.set2.exercise6;

public class StringStorageSizeCalculator {
    public int calculate(String word){
        int bytes = word.length() * 2 + 4;
        int bits = bytes *8;
        return bits;
    }

}
