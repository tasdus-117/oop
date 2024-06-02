package hus.oop.de1.basicstatistics;

import java.util.NoSuchElementException;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;
    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
        head = null;
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        return getNodeByIndex(index).getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index-1);
            MyLinkedListNode currentNode = getNodeByIndex(index);
            previousNode.setNext(currentNode.getNext());
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        if (head == null) {
            head = new MyLinkedListNode(payload);
        } else {
            MyLinkedListNode lastNode = getNodeByIndex(size - 1);
            lastNode.setNext(new MyLinkedListNode(payload));
        }
        size++;
    }


    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if (head == null) {
            head = new MyLinkedListNode(payload);
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index-1);
            MyLinkedListNode newNode = new MyLinkedListNode(payload, previousNode.getNext());
            previousNode.setNext(newNode);
        }
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        MyLinkedListNode currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return  currentNode;
    }

    private class MyLinkedListIterator implements MyIterator {
        /*
         * MyLinkedListIterator cần phải tham chiếu đến node hiện tại của MyLinkedList để có thể duyệt qua
           các phần tử còn lại trong MyLinkedList.
        */
        private MyLinkedListNode currentNode;

        /**
         * Khởi tạo dữ liệu cho Iterator là node hiện tại trong MyLinkedList.
         * @param node
         */
        public MyLinkedListIterator(MyLinkedListNode node) {
            /* TODO */
            currentNode = node;
        }

        /**
         * Kiểm tra trong MyLinkedList có còn phần tử tiếp theo không.
         * Nếu còn thì trả về true, nếu không còn thì trả về false.
         * @return
         */
        @Override
        public boolean hasNext() {
            /* TODO */
            return currentNode != null;
        }

        /**
         * iterator dịch chuyển sang phần tử kế tiếp của MyLinkedList và trả ra dữ liệu (payload) của phần tử hiện tại của MyLinkedList.
         * @return payload của phần tử hiện tại.
         */
        @Override
        public Object next() {
            /* TODO */
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object payload = currentNode.getPayload();
            currentNode = currentNode.getNext();
            return payload;
        }

        @Override
        public void remove() {
            /* TODO */
            throw new UnsupportedOperationException("Remove not supported");
        }
    }
}
