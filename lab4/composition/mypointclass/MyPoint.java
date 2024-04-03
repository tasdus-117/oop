package hus.oop.lab4.composition.mypointclass;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        int xy[] = {x, y};
        return xy;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double distance(int x, int y) {
        return Math.sqrt(x*x+y*y);
    }
    public double distance(MyPoint another) {
        return Math.sqrt((another.x-this.x) * (another.x-this.x) + (another.y-this.y) * (another.y-this.y));
    }
    public double distance() {
        return distance(x,y);
    }
}
