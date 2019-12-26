package academy.everyonecodes.java.optionals.enums.exercise2;

public class Outfit {
    Socks socks;
    Headpiece headpiece;

    public String getDescription(){
        return "This outfit includes " + socks.getDescription() + " and " + headpiece.getDescription() + ".";
    }
}
