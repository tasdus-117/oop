package hus.oop.lab11.factory.button;

public class WindowButton implements Button {
    public void render() {
        System.out.println("Render a button in Window style");
    }

    @Override
    public void onClick() {
        System.out.println("Bind a native OS click event");
    }
}
