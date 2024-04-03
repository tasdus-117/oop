package hus.oop.hus.oop.lab6.pointandline;

public class TestLine {
    public static void main(String[] args) {
        // Creating a Line object using two Point objects
        Point beginPoint = new Point(1, 2);
        Point endPoint = new Point(4, 6);
        Line line1 = new Line(beginPoint, endPoint);
        System.out.println("Line 1: " + line1);

        // Creating a Line object using coordinates
        Line line2 = new Line(3, 5, 7, 9);
        System.out.println("Line 2: " + line2);

        // Testing getter and setter methods
        line1.setBeginX(0);
        line1.setBeginY(0);
        line1.setEndXY(5, 5);
        System.out.println("Updated Line 1: " + line1);

        // Testing length and gradient calculation
        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 1 (in radians): " + line1.getGradient());
    }
}

