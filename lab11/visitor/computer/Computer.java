package hus.oop.lab11.visitor.computer;

public class Computer implements ComputerPart {
    ComputerPart parts[];
    public Computer() {
        parts = new ComputerPart[3];
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
