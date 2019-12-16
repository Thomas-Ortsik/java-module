package academy.everyonecodes.java.week2.set1.exercise1;

public class Student {
    private String name;
    private String peerName;

    public Student(String name, String peerName){
        this.name = name;
        this.peerName = peerName;
    }
    public String getName(){
        return name;
    }
    public String getPeerName(){
        return peerName;
    }
    public void setPeerName(String peerName){
        this.peerName = peerName;
    }
}
