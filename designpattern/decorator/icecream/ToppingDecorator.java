package hus.oop.designpattern.decorator.icecream;

public abstract class ToppingDecorator implements IceCream {
    IceCream iceCream;
    public abstract String getDescription();
    public abstract String addTopping();
}
