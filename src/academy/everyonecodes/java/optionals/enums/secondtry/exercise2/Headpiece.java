package academy.everyonecodes.java.optionals.enums.secondtry.exercise2;

public enum Headpiece {
    BEANIE("a warm beanie for the cold months"),
    CAP("a light cap for the warm months");


    public final String description;

    Headpiece(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
