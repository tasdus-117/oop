package hus.oop.lab7.ExercisesOnPolymorphismAbstractInterfaces.shape;
public class Circle extends Shape {
    protected double radius = 1.0;
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + "," +
                "radius=" + radius +
                ']';
    }
}
