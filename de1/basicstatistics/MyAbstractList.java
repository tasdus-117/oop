package hus.oop.de1.basicstatistics;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {

    }
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder str = new StringBuilder();
        for (int i = 0 ; i < size() ; i++) {
            str.append(  "[" + get(i) + "]");
        }
        return str.toString();
    }
}
