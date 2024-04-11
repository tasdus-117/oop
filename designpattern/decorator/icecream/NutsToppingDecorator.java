package hus.oop.designpattern.decorator.icecream;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }
    public String addTopping() {
        return ", Nuts";
    }
}
