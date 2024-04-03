package hus.oop.lab7.ExercisesOnPolymorphismAbstractInterfaces.shape;

public class Square extends Rectangle {
    public Square() {

    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }
    public double getSide() {
        return super.getLength();
    }
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side) {
        super.width = side;
    }
    public void setLength(double side) {
        super.length = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "," +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
