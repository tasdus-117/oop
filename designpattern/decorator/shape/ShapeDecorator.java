package hus.oop.designpattern.decorator.shape;

public class ShapeDecorator extends Shape {
    Shape shape;
    ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    void draw() {
        shape.draw();
    }
}
