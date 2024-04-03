package hus.oop.lab8.set;
import java.util.*;
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> res = new HashSet<>();
        Iterator<Integer> ite = first.iterator();
        while(ite.hasNext()) {
            Integer value = ite.next();
            if(second.contains(value)) {
                res.add(value);
            }
        }
        return res;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        // TODO: Implement
        Set<Integer> res = new HashSet<>();
        Iterator<Integer> ite = first.iterator();
        while(ite.hasNext()) {
            res.add(ite.next());
        }
        ite = second.iterator();
        while(ite.hasNext()) {
            res.add(ite.next());
        }
        return res;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        // TODO: Implement
        Set<Integer> res = new HashSet<>();

        return null;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        // TODO: Implement
        return null;
    }

    public static List<Integer> toList(Set<Integer> source) {
        // TODO: Implement
        return null;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        // TODO: Implement
        return null;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        // TODO: Implement
        return null;
    }

    public static String firstRecurringCharacter(String s) {
        // TODO: Implement
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        // TODO: Implement
        return null;
    }

    public static Integer[] toArray(Set<Integer> source) {
        // TODO: Implement
        return null;
    }

    public static int getFirst(TreeSet<Integer> source) {
        // TODO: Implement
        return 0;
    }

    public static int getLast(TreeSet<Integer> source) {
        // TODO: Implement
        return 0;
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        // TODO: Implement
        return 0;
    }
}
