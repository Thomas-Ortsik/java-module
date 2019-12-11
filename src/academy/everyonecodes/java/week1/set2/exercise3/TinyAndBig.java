package academy.everyonecodes.java.week1.set2.exercise3;

import java.util.List;

public class TinyAndBig {
    public static boolean isBigger(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;
    }

    public static boolean isSmaller(int firstNumber, int secondNumber) {
        return firstNumber < secondNumber;
    }

    public static int getBiggest(List<Integer> numbers) {
        int biggest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int compare = numbers.get(i);
            if (isBigger(compare, biggest)) {                //why do we have to write a method for this and not just write (x > y)?
                biggest = compare;
            }
        }
        return biggest;
    }

    public static int getSmallest(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int compare = numbers.get(i);
            if (isSmaller(compare, smallest)) {
                smallest = compare;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        List<Integer> collectionOfNumbers = List.of(-1, 4, 3, 0, 5, 2);
        int smallest = getSmallest(collectionOfNumbers);
        int biggest = getBiggest(collectionOfNumbers);
        System.out.println("The largest number is " + biggest + " and the smallest is " + smallest + ".");
    }
}
