package hus.oop.lab11.abstractfactory.shape;
public class ShapeFactory extends AbtractFactory {
    public Shape getShape(String type) {
        if (type.equals("rectangle")) {
            return new Rectangle();
        } else {
            return new Square();
        }
    }
}
