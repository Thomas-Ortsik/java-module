package academy.everyonecodes.java.week3.set1.exercise1;

public class Application {
    public static void main(String[] args) {
        Transport transport = new Transport();
        double totalTime = transport.calculateTotalTime(2.5,1.2,5);
        double distanceTram = 2.5;
        int stations = 5;
        double distanceFriend = 1.2;
        totalTime = transport.calculateTotalTime(distanceTram,distanceFriend,stations);
    }
}
