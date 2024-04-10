package hus.oop.lab9.collections;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;
    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (size == elements.length) {
            enlarge();
        }
        for (int i = size - 1; i  >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = 0;
        size++;
    }
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }
    public void remove(int index) {
        checkBoundaries(index, size-1);
        for (int i = index + 1; i < size; i++) {
            elements[i-1] = elements[i];
        }
        size--;
    }
    public int size() {
        return size;
    }
    void enlarge() {
        Object[] tmp = new Object[elements.length*2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
