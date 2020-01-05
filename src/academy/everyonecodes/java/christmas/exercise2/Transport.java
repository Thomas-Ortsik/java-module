package academy.everyonecodes.java.christmas.exercise2;

public class Transport {
    public double calculateWalkingTime(double distance){
        return distance*15;
    }
    public double calculateTramTime(int stations){
        return stations*4;
    }
    public double calculateTotalTime(double distanceTram, double distanceFriend, int stations){
        return calculateWalkingTime(distanceTram) + calculateWalkingTime(distanceFriend) + calculateTramTime(stations);
    }
}
