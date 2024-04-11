package hus.oop.designpattern.singleton;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        System.out.println(boiler.toString());
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println(boiler2.toString());
    }
}
