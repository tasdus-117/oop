package hus.oop.lab11.abstractfactory.system;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a mac button");
    }
}
