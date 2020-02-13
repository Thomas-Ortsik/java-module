package academy.everyonecodes.java.week8.set2.exercise3.operators;

import java.util.List;

public class Operators {
    public static List<Character> get(){
        return List.of(
                new Division().getSymbol(),
                new Multiplication().getSymbol(),
                new Subtraction().getSymbol(),
                new Sum().getSymbol()
        );
    }
}
