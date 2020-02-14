package academy.everyonecodes.java.week2.example.exercise1Set2;

public class Door   {
    private int doorNumber;
    private String keyphrase;

    public Door(int doorNumber, String keyphrase){
        this.doorNumber = doorNumber;
        this.keyphrase = keyphrase;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getKeyphrase() {
        return keyphrase;
    }

}
