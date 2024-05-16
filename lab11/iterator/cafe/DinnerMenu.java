package hus.oop.lab11.iterator.cafe;

public class DinnerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    String[] menuitems;
    public DinnerMenu() {
        menuitems = new String[MAX_ITEMS];
        addItems("Vegetarian BLT");
        addItems("BLT");
        addItems("Soup of the day");
        addItems("Hotdog");
        addItems("Steamed Veggies and Brown Rice");
        addItems("Pasta");
    }
    public void addItems(String name) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("ERROR: Maximum number of items reached");
        } else {
            menuitems[numberOfItems] = name;
            numberOfItems++;
        }
    }
    public String[] getMenuitems() {
        return menuitems;
    }
    public Iterator createIterator() {
        return new DinnerMenuIterator(menuitems);
    }
    public String toString() {
        return "Dinner Menu";
    }
}
