package hus.oop.lab7.GeometrixObject;

public class TestGeometricObject {
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle:");
        System.out.println(rectangle); // Calls toString() method
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println(); // Adding a line break for clarity

        // Creating a Circle object
        Circle circle = new Circle(2.5);
        System.out.println("Circle:");
        System.out.println(circle); // Calls toString() method
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
