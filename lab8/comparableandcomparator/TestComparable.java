package hus.oop.lab8.comparableandcomparator;
import java.util.*;
public class TestComparable {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting:");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }
}
