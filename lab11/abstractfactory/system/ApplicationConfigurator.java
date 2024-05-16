package hus.oop.lab11.abstractfactory.system;
import hus.oop.lab11.factory.fruits.Application;

import java.util.*;
public class ApplicationConfigurator {
    public static void main(String[] args) throws Exception {
        GUIFactory factory;
        Scanner sc = new Scanner(System.in);
        String config = sc.nextLine();
        if (config.equals("Windows")) {
            factory = new WinFactory();
        } else if (config.equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new Exception("Error!");
        }
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
