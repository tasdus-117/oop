package hus.oop.lab11.visitor.computer;

public class VisitorPatternDemo {
    private ComputerPartVisitor computerPartVisitor;
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;
    private Computer computer;
    public static void main(String[] args) {
        VisitorPatternDemo demo = new VisitorPatternDemo();
        demo.setup();
        demo.testMouse();
        demo.testKeyboard();
        demo.testMonitor();
        demo.testComputer();
    }
    public void setup() {
        computerPartVisitor = new ComputerPartDisplayVisitor();
        mouse = new Mouse();
        keyboard = new Keyboard();
        monitor = new Monitor();
        computer = new Computer();
    }
    public void testMouse() {
        mouse.accept(computerPartVisitor);
    }
    public void testKeyboard() {
        keyboard.accept(computerPartVisitor);
    }
    public void testMonitor() {
        monitor.accept(computerPartVisitor);
    }
    public void testComputer() {
        computer.accept(computerPartVisitor);
    }

}
