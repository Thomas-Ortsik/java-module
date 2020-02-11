package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class SuperheroCaller {
    List<Superhero> superheroes;

    public SuperheroCaller() {
        Superhero batman = new Batman();
        Superhero spiderman = new Spiderman();
        Superhero superman = new Superman();
        this.superheroes = List.of(batman, superman, spiderman);
    }

    public Optional<Superhero> findSuperhero(String keyword) {
        for (Superhero hero : superheroes) {
            if (hero.getPrivateName().contains(keyword) || hero.getSuperheroName().equals(keyword)){
                return Optional.of(hero);
            }
        }
        return Optional.empty();
    }
}
