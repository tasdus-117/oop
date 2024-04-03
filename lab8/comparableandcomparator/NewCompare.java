package hus.oop.lab8.comparableandcomparator;

import java.util.Comparator;

public class NewCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}
