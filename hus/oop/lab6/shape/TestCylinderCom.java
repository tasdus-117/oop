package hus.oop.hus.oop.lab6.shape;

public class TestCylinderCom {
    public static void main(String[] args) {
        CylinderCom cylinder1 = new CylinderCom();
        System.out.println(cylinder1);

        CylinderCom cylinder2 = new CylinderCom("blue", 2.0, 3.0);
        System.out.println(cylinder2);

        cylinder2.setHeight(4.0);
        System.out.println("Height of cylinder2: " + cylinder2.getHeight());

        // Test getVolume() method
        System.out.println("Volume of cylinder2: " + cylinder2.getVolume());
    }
}
