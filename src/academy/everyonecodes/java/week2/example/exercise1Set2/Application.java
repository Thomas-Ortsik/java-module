package academy.everyonecodes.java.week2.example.exercise1Set2;

public class Application {
    public static void main(String[] args) {
        Door door = new Door(5, "aloha");
        Key key1 = new Key("Mike", "aloha");
        Key key2 = new Key("Donald", "rrrrrrr");
        DoorOpener.open(door, key1);
        DoorOpener.open(door, key2);
    }
}
