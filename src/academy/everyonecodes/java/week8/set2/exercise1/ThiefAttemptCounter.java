package academy.everyonecodes.java.week8.set2.exercise1;

public class ThiefAttemptCounter {
    public int countAttempts(Safe safe, Thief badThief) {
        int counter = 0;
        while (safe.getDifficultyPoints() > 0){
            badThief.open(safe);
            counter++;
        }
        return counter;
    }
}
