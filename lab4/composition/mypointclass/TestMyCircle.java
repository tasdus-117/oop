package hus.oop.lab4.composition.mypointclass;

public class TestMyCircle {
    public static void main(String[] args) {
        // Create a MyCircle object with default values
        MyCircle circle1 = new MyCircle();
        System.out.println("Circle 1 information:");
        System.out.println(circle1);

        // Create a MyCircle object with specified values
        MyCircle circle2 = new MyCircle(3, 4, 5);
        System.out.println("\nCircle 2 information:");
        System.out.println(circle2);

        // Display the area and circumference of the circles
        System.out.println("\nArea of Circle 1: " + circle1.getArea());
        System.out.println("Circumference of Circle 1: " + circle1.getCircumference());
        System.out.println("\nArea of Circle 2: " + circle2.getArea());
        System.out.println("Circumference of Circle 2: " + circle2.getCircumference());

        // Change the center of Circle 1
        circle1.setCenter(new MyPoint(1, 1));

        // Display the information of Circle 1 after modifying the center
        System.out.println("\nCircle 1 information after center modification:");
        System.out.println(circle1);

        // Calculate the distance between two circles
        System.out.println("\nDistance between Circle 1 and Circle 2: " + circle1.distance(circle2));
    }
}
