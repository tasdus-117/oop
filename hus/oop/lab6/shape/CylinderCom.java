package hus.oop.hus.oop.lab6.shape;

public class CylinderCom {
    private Circle base;
    private double height;
    public CylinderCom() {
        base = new Circle();
        height = 1.0;
    }
    public CylinderCom(String color, double radius, double height){
        base = new Circle(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder: subclass of " + base.toString() + " height=" + height;
    }
}
