package hus.oop.lab7.AnotherView;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }
    public void greeting(Dog another) {
        System.out.println("Woooooooooooooooof!");
    }
}
