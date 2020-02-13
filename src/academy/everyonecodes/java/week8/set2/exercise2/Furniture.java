package academy.everyonecodes.java.week8.set2.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Furniture {
    private List<String> parts;
    private String name;

    public Furniture(String name) {
        this.name = name;
        this.parts = new ArrayList<String>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture furniture = (Furniture) o;
        return Objects.equals(parts, furniture.parts) &&
                Objects.equals(name, furniture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parts, name);
    }

    public String getName() {
        return name;
    }

    public List<String> getParts() {
        return parts;
    }
}
