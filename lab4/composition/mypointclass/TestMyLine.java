package hus.oop.lab4.composition.mypointclass;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);
        MyLine line = new MyLine(point1, point2);
        System.out.println("Line information:");
        System.out.println(line);
        System.out.println("Begin point: (" + line.getBeginX() + ", " + line.getBeginY() + ")");
        System.out.println("End point: (" + line.getEndX() + ", " + line.getEndY() + ")");
        System.out.println("Length of the line: " + line.getLength());
        System.out.println("Gradient of the line: " + line.getGradient());
        line.setBeginXY(3, 4);
        line.setEndXY(7, 8);
        System.out.println("\nLine information after modification:");
        System.out.println(line);
        System.out.println("Begin point: (" + line.getBeginX() + ", " + line.getBeginY() + ")");
        System.out.println("End point: (" + line.getEndX() + ", " + line.getEndY() + ")");
        System.out.println("Length of the line: " + line.getLength());
        System.out.println("Gradient of the line: " + line.getGradient());
    }
}
