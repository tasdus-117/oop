package hus.oop.lab7.InterfacesResizableGeometricObject;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }
    public String toString(){
        return "ResizableCircle" + super.toString() + "]";
    }
    public void resize(int percent) {
        radius *= percent/100.0;
    }
}
