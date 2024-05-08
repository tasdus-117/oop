package hus.oop.designpattern.decorator.shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    public void draw() {
        super.draw();
        setRedBorder();
    }
    private void setRedBorder() {
        System.out.print(" with a red border");
    }
}
