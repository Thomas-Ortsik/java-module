package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HikerGatherer {
    public List<Hiker> gather() {
        List<Hiker> hikers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What's the name of the hiker?");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;}
            System.out.println("And telephone number?");
            int telNumber = scanner.nextInt();
            scanner.nextLine();
            Hiker hiker = new Hiker(name, telNumber);
            hikers.add(hiker);}
        return hikers;
        }
    }
