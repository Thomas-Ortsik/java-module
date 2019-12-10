package academy.everyonecodes.java.week1.set1.exercise2;

public class Sum {
    public static int sumInt(int number1, int number2) {
        return number1+number2;
    }
    public static double sumDouble(double number1, double number2) {
        return number1+number2;
    }

    public static void main(String[] args){
        int firstInt = 3;
        int secondInt = 9;
        double firstDouble = 38.28;
        double secondDouble = 3.6;
        double sumD = sumDouble(firstDouble,secondDouble);
        System.out.println("The int sum is " + sumInt(firstInt,secondInt));
        System.out.println("The double sum is "+sumD);
    }
}
