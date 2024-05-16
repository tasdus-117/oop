package hus.oop.designpattern.singleton.exp;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.value);
    }
}
