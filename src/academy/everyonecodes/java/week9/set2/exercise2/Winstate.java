package academy.everyonecodes.java.week9.set2.exercise2;

public enum Winstate {
    WIN("You win!"),
    LOSS("You lose :("),
    DRAW("Draw. Everyone's a winner!");

    private final String description;

    private Winstate(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
