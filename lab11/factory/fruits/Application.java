package hus.oop.lab11.factory.fruits;

import hus.oop.lab11.abstractfactory.system.Button;
import hus.oop.lab11.abstractfactory.system.Checkbox;
import hus.oop.lab11.abstractfactory.system.GUIFactory;

public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkBox;
    public Application(){}
    public Application(GUIFactory factory) {
        this.factory = factory;
    }
    public void createUI() {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckbox();
    }
    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
