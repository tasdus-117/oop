package hus.oop.lab11.factory.button;

public class WindowDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowButton();
    }
}
