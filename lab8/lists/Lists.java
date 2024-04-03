package hus.oop.lab8.lists;
import java.util.*;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.addFirst(value);
    }
    public static void insertLast(List<Integer> list, int value) {
        list.addLast(value);
    }
    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }
    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }
    public static void removeEvil(List<Integer> list) {
        if (contains(list, 666)) {
            list.remove(Integer.valueOf(666));
        } else {
            System.out.println("Thanks god!");
        }
    }
    public static List<Integer> generateSquare() {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            res.add(i*i);
        }
        return res;
    }

    public static boolean contains(List<Integer> list, int value) {
        // TODO
        return list.contains(value);
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        // TODO
        for(int i = 0; i < source.size(); i++) {
            target.add(source.get(i));
        }
    }

    public static void reverse(List<Integer> list) {
        list.reversed();
        // TODO
    }

    public static void reverseManual(List<Integer> list) {
        // TODO
        int left = 0 ;
        int right = list.size()-1;
        while (left <= right) {
            int value = list.get(left);
            list.set(left, list.get(right));
            list.set(right, value);
            left++;
            right--;
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        // TODO
        list.addFirst(value);
        list.addLast(value);
    }
}
