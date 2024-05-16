package hus.oop.lab11.abstractfactory.system;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render window button");
    }
}
