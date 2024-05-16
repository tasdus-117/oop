package hus.oop.lab11.visitor.computer;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard");
    }

    public void visit(Monitor monitor) {
        System.out.println("Monitor");
    }
}
