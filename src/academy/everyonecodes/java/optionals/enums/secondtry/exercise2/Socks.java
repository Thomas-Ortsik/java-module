package academy.everyonecodes.java.optionals.enums.secondtry.exercise2;

public enum Socks {
    GREENSOCKS("green socks with holes"),
    YELLOWSOCKS("yellow socks with dots and stripes"),
    REDSOCKS("red socks"),
    WHITESOCKS("white sox, because red sox need their rival");

    private final String description;
    private Socks (String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
