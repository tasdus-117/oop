package hus.oop.hus.oop.lab6.shape2;

public class TestShape2 {
    public static void main(String[] args) {
        // Creating a Shape object
        Shape shape = new Shape("blue", false);
        System.out.println("Shape: " + shape);

        // Creating a Circle object
        Circle circle = new Circle("green", true, 5.0);
        System.out.println("Circle: " + circle);

        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle("yellow", true, 4.0, 6.0);
        System.out.println("Rectangle: " + rectangle);

        // Creating a Square object
        Square square = new Square("orange", false, 5.0);
        System.out.println("Square: " + square);

        // Testing getters and setters
        shape.setColor("purple");
        shape.setFilled(true);
        circle.setRadius(6.0);
        rectangle.setWidth(5.0);
        rectangle.setHeigth(7.0);
        square.setSide(6.0);

        // Printing updated objects
        System.out.println("Updated Shape: " + shape);
        System.out.println("Updated Circle: " + circle);
        System.out.println("Updated Rectangle: " + rectangle);
        System.out.println("Updated Square: " + square);

        // Testing area and perimeter calculation
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPermeter());
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
