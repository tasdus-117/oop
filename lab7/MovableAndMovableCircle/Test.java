package hus.oop.lab7.MovableAndMovableCircle;

public class Test {
    public static void main(String[] args) {
        // Creating a movable point
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println("Original Point: " + point);
        point.moveUp();
        System.out.println("Point after moving up: " + point);

        // Creating a movable circle
        MovableCircle circle = new MovableCircle(5, 6, 2, 3, 10);
        System.out.println("Original Circle: " + circle);
        circle.moveDown();
        System.out.println("Circle after moving down: " + circle);
    }
}
