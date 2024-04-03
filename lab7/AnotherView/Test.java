package hus.oop.lab7.AnotherView;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();

        Dog dog1 = new Dog();
        dog1.greeting();

        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();

        Animal animal2 = new Dog();
        animal2.greeting();

        Animal animal3 = new BigDog();
        animal3.greeting();

        // Downcast
        Dog dog2 = new Dog();
        BigDog bigDog2 = new BigDog();
        Dog dog3 = new Dog();
        Cat cat2 = new Cat();
        if(animal2 instanceof Dog) {
            dog2 = (Dog) animal2;
        }
        if(animal3 instanceof BigDog) {
            bigDog2 = (BigDog) animal3;
        }
        if(animal3 instanceof Dog) {
            dog3 = (Dog) animal3;
        }
        if(animal2 instanceof Cat) {
            cat2 = (Cat) animal2;
        }

        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
