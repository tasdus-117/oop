package hus.oop.hus.oop.lab6.shape2;

public class Rectangle extends Shape {
    private double width;
    private double heigth;
    public Rectangle() {

    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(String color, boolean filled, double width, double heigth) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getArea() {
        return width*heigth;
    }
    public double getPerimeter() {
        return width*2+heigth*2;
    }
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + "," +
                "width=" + width +
                ", heigth=" + heigth +
                ']';
    }
}
