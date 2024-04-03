package hus.oop.lab4.composition.mypointclass;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine() {

    }
    public MyLine(int x1, int y1, int x2, int y2) {
        begin.setXY(x1, y1);
        end.setXY(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public void setBeginX(int x) {
        begin.setX(x);
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginY(int y) {
        begin.setY(y);
    }
    public int getEndX() {
        return end.getX();
    }
    public void setEndX(int x) {
        end.setX(x);
    }
    public int getEndY() {
        return end.getY();
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public int[] getBeginXY() {
        int[] beginXY = {begin.getX(), begin.getY()};
        return beginXY;
    }
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }
    public int[] getEndXY() {
        int[] endXY = {end.getX(), end.getY()};
        return endXY;
    }
    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        return Math.atan2(Math.abs(begin.getY()-end.getY()),Math.abs(begin.getX()-end.getX()));
    }
    public String toString() {
        return "MyLine[begin=(" +begin.getX() + "," + begin.getY() + ")" + ",end=(" + end.getX() + "," + end.getY() + ")]";
    }
}
