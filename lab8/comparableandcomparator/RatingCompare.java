package hus.oop.lab8.comparableandcomparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    public  int compare(Movie left, Movie right) {
        return Double.compare(left.getRating(), right.getRating());
    }
}
