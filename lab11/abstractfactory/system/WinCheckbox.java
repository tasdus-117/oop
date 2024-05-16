package hus.oop.lab11.abstractfactory.system;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Render a checkbox window");
    }
}
