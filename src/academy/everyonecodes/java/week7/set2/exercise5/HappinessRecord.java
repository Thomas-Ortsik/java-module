package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Objects;

public class HappinessRecord {
    private String country;
    private int rank;
    private double score;

    public HappinessRecord(String country, int rank, double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HappinessRecord)) return false;
        HappinessRecord that = (HappinessRecord) o;
        return getRank() == that.getRank() &&
                Double.compare(that.getScore(), getScore()) == 0 &&
                getCountry().equals(that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getRank(), getScore());
    }

    public String getCountry() {
        return country;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }


}

