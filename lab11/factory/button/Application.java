package hus.oop.lab11.factory.button;
import java.util.*;
public class Application {
    public static Scanner sc = new Scanner(System.in);
    private static Dialog dialog;
    private static void initialize() throws Exception {
        String config = sc.nextLine();
        if (config.equals("Windows")) {
            dialog = new WindowDialog();
        } else if (config.equals("Web")) {
            dialog = new WindowDialog();
        } else {
            throw new Exception("Error!");
        }
    }
    public static void main(String[] args) {
        try {
            initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        dialog.render();
    }
}
