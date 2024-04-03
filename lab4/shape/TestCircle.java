package hus.oop.lab4.shape;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius()
                + " and  area of " + circle1.getArea());
        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius()
                + " and  area of " + circle2.getArea());
        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("The circle has radius of " + circle4.getRadius()
                + " and  area of " + circle4.getArea());
        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());
        //System.out.println(circle4.setRadius(4.4));
        Circle circle5 = new Circle(5.5);
        System.out.println(circle5.toString());
        Circle cirlce6 = new Circle(6.6);
        System.out.println(cirlce6.toString());
        System.out.println(cirlce6);
        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());
        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circumference is: %.2f%n", circle1.getCircumference());
    }
}
