package hus.oop.lab4.composition.mypointclass;

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create a MyRectangle object with default values
        MyRectangle rectangle1 = new MyRectangle();
        System.out.println("Rectangle 1 information:");
        System.out.println(rectangle1);

        // Create a MyRectangle object with specified values
        MyRectangle rectangle2 = new MyRectangle(new MyPoint(1, 1), new MyPoint(4, 3));
        System.out.println("\nRectangle 2 information:");
        System.out.println(rectangle2);

        // Display the width, height, area, and perimeter of the rectangles
        System.out.println("\nWidth of Rectangle 1: " + rectangle1.getWidth());
        System.out.println("Height of Rectangle 1: " + rectangle1.getHeight());
        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());

        System.out.println("\nWidth of Rectangle 2: " + rectangle2.getWidth());
        System.out.println("Height of Rectangle 2: " + rectangle2.getHeight());
        System.out.println("Area of Rectangle 2: " + rectangle2.getArea());
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.getPerimeter());
    }
}
