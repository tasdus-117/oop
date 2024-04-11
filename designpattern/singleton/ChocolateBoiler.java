package hus.oop.designpattern.singleton;

public class ChocolateBoiler {
    public static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null); {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            empty = true;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }

    @Override
    public String toString() {
        return "ChocolateBoiler{" +
                "empty=" + empty +
                ", boiled=" + boiled +
                '}';
    }
}
