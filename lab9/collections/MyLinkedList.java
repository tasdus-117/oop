package hus.oop.lab9.collections;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        this.head = null ;
        this.size = 0;
    }
    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
    public void add(Object o) {
        add(o, size);
    }
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }
    public Object get(int index) {
        checkBoundaries(index, size-1);
        MyLinkedListNode node = getNodeByIndex(index);
        return node.getPayload();
    }
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode preNode = getNodeByIndex(index - 1);
            preNode.setNext(preNode.getNext().getNext());
        }
        size--;
    }
    public int size() {
        return size;
    }
}
