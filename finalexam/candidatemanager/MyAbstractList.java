package hus.oop.finalexam.candidatemanager;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    public MyAbstractList() {};
    @Override
    public String toString() {
        /* TODO */
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            str.append("[" + get(i) + "]");
        }
        return str.toString();
    }
}
