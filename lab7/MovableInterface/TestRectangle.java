package hus.oop.lab7.MovableInterface;
public class TestRectangle {
    public static void main(String[] args) {
        // Test MovablePoint
        System.out.println("Testing MovablePoint:");
        Movable m1 = new MovablePoint(5, 6, 10, 15); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        // Test MovableRectangle
        System.out.println("\nTesting MovableRectangle:");
        Movable movableRectangle = new MovableRectangle(0, 0, 5, 5, 1, 1);
        System.out.println("Original position: " + movableRectangle);
        movableRectangle.moveUp();
        movableRectangle.moveRight();
        System.out.println("After moving up and right: " + movableRectangle);
    }
}
