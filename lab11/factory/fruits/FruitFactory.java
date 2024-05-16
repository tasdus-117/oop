package hus.oop.lab11.factory.fruits;

public class FruitFactory {
    public Fruits provideFruit(String type) throws Exception {
        Fruits fruits;
        if (type.equals("Apple")) {
            fruits = new Apple();
        } else if (type.equals("Banana")) {
            fruits = new Banana();
        } else if (type.equals("Orange")) {
            fruits = new Orange();
        } else {
            throw new Exception("Invalid fruit type");
        }
        return fruits;
    }
}
