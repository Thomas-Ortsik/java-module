package academy.everyonecodes.java.week8.set2.exercise1;

public class Safe {
    private int difficultyPoints;

    public Safe(int difficultyPoints, int securityLevel) {
        this.difficultyPoints = difficultyPoints;
        this.securityLevel = securityLevel;
    }

    private int securityLevel;

    public int getSecurityLevel() {
        return securityLevel;
    }

    public int getDifficultyPoints() {
        return difficultyPoints;
    }

    public void setDifficultyPoints(int difficultyPoints) {
        this.difficultyPoints = difficultyPoints;
    }
}
