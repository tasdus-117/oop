package hus.oop.lab11.factory.fruits;

import org.w3c.dom.ls.LSOutput;

public class Banana implements Fruits {
    @Override
    public void produceJuice() {
        System.out.println("Banana juice");
    }
}
