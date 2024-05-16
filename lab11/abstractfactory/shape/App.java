package hus.oop.lab11.abstractfactory.shape;
import java.util.*;
public class App {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        FactoryProducer factoryProducer = new FactoryProducer();
        factoryProducer.getAbtractFactory().getShape(type).draw();
    }
}
