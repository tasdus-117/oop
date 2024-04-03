package hus.oop.lab4.composition.mypointclass;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Create a MyTriangle object with default values
        MyTriangle triangle1 = new MyTriangle();
        System.out.println("Triangle 1 information:");
        System.out.println(triangle1);

        // Create a MyTriangle object with specified values
        MyTriangle triangle2 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("\nTriangle 2 information:");
        System.out.println(triangle2);

        // Display the perimeter of the triangles
        System.out.println("\nPerimeter of Triangle 1: " + triangle1.getPerimeter());
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());

        // Display the type of triangles
        System.out.println("\nType of Triangle 1: " + triangle1.getType());
        System.out.println("Type of Triangle 2: " + triangle2.getType());
    }
}
