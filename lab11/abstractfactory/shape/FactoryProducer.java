package hus.oop.lab11.abstractfactory.shape;

public class FactoryProducer {
    public AbtractFactory getAbtractFactory() {
        return new ShapeFactory();
    }
}
