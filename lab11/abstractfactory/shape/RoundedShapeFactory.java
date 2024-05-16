package hus.oop.lab11.abstractfactory.shape;

public class RoundedShapeFactory extends ShapeFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("Rounded Rectangle")) {
        return new RoundedRectangle();
    } else {
        return new RoundedSquare();
    }
}
}
