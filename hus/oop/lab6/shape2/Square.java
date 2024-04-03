package hus.oop.hus.oop.lab6.shape2;

public class Square extends Rectangle {
    public Square() {

    }
    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return super.getHeigth();
    }
    public void setSide(double size) {
        super.setHeigth(size);
    }
    public void setLength(double side) {
        setSide(side);
    }
    public void setWidth(double side) {
        setSide(side);
    }
    public String toString() {
        return "Square[" + super.toString() + ",width=" + getWidth() + ",length=" + getSide() + "]]";
    }
}
