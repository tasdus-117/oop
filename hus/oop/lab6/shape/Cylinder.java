package hus.oop.hus.oop.lab6.shape;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder () {
        super();
    }
    public Cylinder(double radius) {
        super(radius);
    }
    public Cylinder (double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder (double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight() {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + "height=" + height;
    }
}
