package hus.oop.designpattern.singleton.pseudocode;

public class App {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("Select * from foo");
        Database bar = Database.getInstance();
        bar.query("Select * from bar");
    }
}
