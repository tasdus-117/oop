package hus.oop.lab9.collections;

import java.util.Objects;

public class TestApp {
    public static void main(String[] args) {
        MyList l = new MyArrayList();
        l.add("a", 0);
        l.add("b");
        l.add("c", 0);
        l.add("c", 3);
        l.remove(3);
        System.out.println(l.size());
        // Print elements of the list
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
