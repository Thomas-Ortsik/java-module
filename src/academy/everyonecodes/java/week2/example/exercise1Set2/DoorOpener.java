package academy.everyonecodes.java.week2.example.exercise1Set2;

public class DoorOpener {
    public static void open(Door door, Key key) {
        if (door.getKeyphrase() == key.getKeyphrase()) {
            System.out.println("I'm opening door " + door.getDoorNumber() + " using " + key.getName() + "'s key.");
        }
        else if (door.getKeyphrase() != key.getKeyphrase()) {
            System.out.println("This is the wrong key!");
        }
        else {
            System.out.println( "Something went wrong in the code");
        }
    }
}
