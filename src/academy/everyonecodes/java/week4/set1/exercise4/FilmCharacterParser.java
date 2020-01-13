package academy.everyonecodes.java.week4.set1.exercise4;

import java.util.List;

public class FilmCharacterParser {
    public FilmCharacter parse(String names){
        String[] namesSplit = names.split(";");
        FilmCharacter filmCharacter = new FilmCharacter(namesSplit[0], namesSplit[1]);
        return filmCharacter;
    }
}
