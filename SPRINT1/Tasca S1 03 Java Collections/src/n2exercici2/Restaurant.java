package n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Restaurant that)) return false;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Restaurant restaurant) {
        int index = this.getName().compareTo(restaurant.getName());
        if (index != 0) {
            return index;
        }
        return Integer.compare(restaurant.getScore(), this.score);
    }

    @Override
    public String toString() {
        return this.name + "Score: " + this.score;
    }
}
