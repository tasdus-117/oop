package hus.oop.lab7.AbstractAnimal;

public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public void greets() {
        System.out.println("Meow");
    }
}
