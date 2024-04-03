package hus.oop.lab7.AbstractAnimal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void greets() {
        System.out.println("Meow");
    }
}
