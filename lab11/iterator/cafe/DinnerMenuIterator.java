package hus.oop.lab11.iterator.cafe;

public class DinnerMenuIterator implements Iterator {
    private String[] items;
    private int position = 0;
    public DinnerMenuIterator(String[] items) {
        this.items = items;
    }
    public String next() {
        String menuItem = items[position];
        position++;
        return menuItem;
    }
    public boolean hasNext() {
        return (position <= items.length || items[position] != null);
    }

}
