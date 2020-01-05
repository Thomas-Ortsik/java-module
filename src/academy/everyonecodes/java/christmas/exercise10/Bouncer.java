package academy.everyonecodes.java.christmas.exercise10;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bouncer {
    public boolean isAdult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you 18 or older?");
        String above18 = scanner.nextLine();
        if (above18.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWearingAHat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wearing a hat?");
        String hasHat = scanner.nextLine();
        if (hasHat.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean knowsSecretPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the secret password?");
        String password = scanner.nextLine();
        if (password.equals("Hokopoko")) {
            return true;
        } else {
            return false;
        }
    }
}
