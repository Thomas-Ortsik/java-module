package academy.everyonecodes.java.optionals.enums.secondtry.exercise2;

public class Outfit {
    private Socks socks;
    private Headpiece headpiece;

    public Socks getSocks() {
        return socks;
    }

    public void setSocks(Socks socks) {
        this.socks = socks;
    }

    public Headpiece getHeadpiece() {
        return headpiece;
    }

    public void setHeadpiece(Headpiece headpiece) {
        this.headpiece = headpiece;
    }

    public String getDescription() {
        return "This outfit includes " + socks.getDescription() + " and " + headpiece.getDescription() + ".";
    }

}
