package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.Optional;

public class Character {
    //i know now that it was supposed to be all strings, so i overloaded the getters to turn the Optionals into Strings with the standard getter.
    //i hope this is fine? Not sure, but it looked like a good place to play around with optionals
    private String name;
    private Optional<Integer> bookOfDeath;
    private Optional<Integer> gender;

    public String getName() {
        return name;
    }

    public String getBookOfDeath() {
        if (bookOfDeath.isEmpty()){
            return "";
        }
        return bookOfDeath.toString();
    }
//lets try overloading
    public Optional<Integer> getGender(String optional){return gender;}
    public Optional<Integer> getBookOfDeath(String optional){return bookOfDeath;}

    public String getGender() {
        if (gender.isEmpty()){return "unknown gender";}
        if (gender.get()==0){
            return "female";
        }
        if(gender.get()==1){
            return "male";
        }
        else {return "non-binary";}
    }

    public Character(String name, Optional<Integer> bookOfDeath, Optional<Integer> gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }
}
