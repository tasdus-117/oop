package hus.oop.lab11.iterator.cafe;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    private List<String> menuItems;
    public PancakeHouseMenu() {
        menuItems = new ArrayList<String>();
        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }
    private void addItem(String item) {
        menuItems.add(item);
    }
    public List<String> getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Pancake House Menu";
    }
}
