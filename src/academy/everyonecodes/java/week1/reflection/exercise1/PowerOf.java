package academy.everyonecodes.java.week1.reflection.exercise1;

public class PowerOf {
    public static int raiseToPower(int number1, int number2) {
        int powered = number1;
        if (number2 == 0) {
            return 0;
        } else {
        }
        for (int i = 1; i < number2; i++) {
            powered = powered * number1;
        }
        return powered;
    }



    public static void main(String[] args) {

        int number = 0;
        int powerOf = 1;
        System.out.println(raiseToPower(number, powerOf));
    }
}
