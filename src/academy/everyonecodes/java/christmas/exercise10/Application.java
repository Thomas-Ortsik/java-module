package academy.everyonecodes.java.christmas.exercise10;

public class Application {

    public static void main(String[] args) {
        Bouncer bouncer = new Bouncer();
        boolean is18 = bouncer.isAdult();
        boolean hasHat = bouncer.isWearingAHat();
        boolean knowsPassword = bouncer.knowsSecretPassword();
        if (is18 && hasHat && knowsPassword) {
            System.out.println("You can enter our club.");
        } else {
            System.out.println("I'm sorry, but you cannot enter our club.");
        }
    }
}
