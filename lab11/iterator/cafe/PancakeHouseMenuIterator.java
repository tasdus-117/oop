package hus.oop.lab11.iterator.cafe;
import java.util.ArrayList;
import java.util.List;
public class PancakeHouseMenuIterator implements Iterator {
    private List<String> items;
    private int position = 0;
    public PancakeHouseMenuIterator(List<String> items) {
        this.items = items;
    }
    public String next() {
        String menuItem = items.get(position);
        position++;
        return menuItem;
    }
    public boolean hasNext() {
        return position < items.size();
    }
}
