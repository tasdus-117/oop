package hus.oop.hus.oop.lab6.animal;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
