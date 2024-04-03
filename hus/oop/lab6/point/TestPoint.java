package hus.oop.hus.oop.lab6.point;

public class TestPoint {
    public static void main(String[] args) {
        // Creating a Point2D object
        Point2D point2D = new Point2D(2.5f, 3.5f);
        System.out.println("Point2D: " + point2D);

        // Creating a Point3D object
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);

        // Testing getters and setters
        point2D.setX(4.5f);
        point2D.setY(5.5f);
        point3D.setZ(4.5f);
        point3D.setXY(3.0f, 4.0f);

        // Printing updated objects
        System.out.println("Updated Point2D: " + point2D);
        System.out.println("Updated Point3D: " + point3D);

        // Testing getXY and getXYZ methods
        float[] xy = point2D.getXY();
        float[] xyz = point3D.getXYZ();

        System.out.println("Point2D XY: (" + xy[0] + ", " + xy[1] + ")");
        System.out.println("Point3D XYZ: (" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + ")");
    }
}
