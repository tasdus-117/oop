package hus.oop.lab7.AbstractAnimal;

public class Test {
    public static void main(String[] args) {
        // Creating instances of animals
        Animal cat = new Cat("Fluffy");
        Animal dog = new Dog("Buddy");
        Animal bigDog = new BigDog("Max");

        // Testing greets method
        cat.greets(); // Output: Meow
        dog.greets(); // Output: Woof
        bigDog.greets(); // Output: Wooow

        // Downcasting and testing overridden greets method
        if (dog instanceof Dog && bigDog instanceof BigDog) {
            Dog anotherDog = (Dog) dog;
            BigDog anotherBigDog = (BigDog) bigDog;

            // Testing overridden greets method after downcasting
            anotherDog.greets(); // Output: Woof
            anotherBigDog.greets(); // Output: Wooow

            // Testing overloaded greets method after downcasting
            anotherDog.greets(anotherDog); // Output: Woooooof
            anotherBigDog.greets(anotherBigDog); // Output: Wooooooooooow
        } else {
            System.out.println("Downcasting failed: Object is not of appropriate type.");
        }
    }
}
