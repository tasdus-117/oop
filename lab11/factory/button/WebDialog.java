package hus.oop.lab11.factory.button;

public class WebDialog extends Dialog {
    Button createButton() {
        return new HTMLButton();
    }
}
