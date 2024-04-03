package hus.oop.lab7.MovableInterface;

public class TestMove {
    public static void main(String[] args) {
        // Creating a movable point
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println("Original Point: " + point);
        point.moveUp();
        System.out.println("Point after moving up: " + point);

        // Creating another movable point
        MovablePoint anotherPoint = new MovablePoint(5, 6, 2, 3);
        System.out.println("Original Another Point: " + anotherPoint);
        anotherPoint.moveLeft();
        System.out.println("Another Point after moving left: " + anotherPoint);
    }
}
