package hus.oop.lab4.shape;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        color = newColor;
    }
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    public double getCircumference() {
        return 2.0*Math.PI*radius;
    }
}
