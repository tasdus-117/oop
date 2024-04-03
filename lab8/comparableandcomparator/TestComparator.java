package hus.oop.lab8.comparableandcomparator;
import java.io.*;
import java.util.*;
public class TestComparator {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        // Sort by rating using RatingCompare
        System.out.println("Sorted by rating:");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }

        // Sort by name using NameCompare
        System.out.println("\nSorted by name:");
        NewCompare nameCompare = new NewCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }

        // Sort by year using Comparable
        System.out.println("\nSorted by year:");
        Collections.sort(list);
        for (Movie movie : list) {
            System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName());
        }
    }
}
