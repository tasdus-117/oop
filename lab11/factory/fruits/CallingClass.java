package hus.oop.lab11.factory.fruits;
import java.util.*;
public class CallingClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        FruitFactory factory = new FruitFactory();
        factory.provideFruit(type).produceJuice();
    }
}
