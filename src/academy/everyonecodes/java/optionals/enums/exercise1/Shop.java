package academy.everyonecodes.java.optionals.enums.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
        private List<TShirt> availableShirts;

    public Shop() {
        List<TShirt> availableShirts = new ArrayList<>();
        for (int i=0; i<10; i++){
            int price = getRandomInteger(13,25);
            TShirt shirt = new TShirt("default", Size.S, price);
            int colorRandom = getRandomInteger(0,3);
            int sizeRandom = getRandomInteger(0,5);
            switch(sizeRandom){
                case 0:
                    shirt.setSize(Size.XS);
                    break;
                case 1:
                    shirt.setSize(Size.S);
                    break;
                case 2:
                    shirt.setSize(Size.M);
                    break;
                case 3:
                    shirt.setSize(Size.L);
                    break;
                case 4:
                    shirt.setSize(Size.XL);
                    break;
                case 5:
                    shirt.setSize(Size.XXL);
            }
            switch (colorRandom){
                case 0:
                    shirt.setColor("red");
                    break;
                case 1:
                    shirt.setColor("orange");
                    break;
                case 2:
                    shirt.setColor("blue");
                    break;
                case 3:
                    shirt.setColor("black");
            }
            availableShirts.add(shirt);
        }
        this.availableShirts = availableShirts;
    }

    public List<TShirt> getAvailableShirts() {
        return availableShirts;
    }

    public int getRandomInteger(int rangeMin, int rangeMax){
        Random random = new Random();
        return random.ints(rangeMin, (rangeMax+1)).findFirst().getAsInt();
    }
}
