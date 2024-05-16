package hus.oop.lab11.visitor.computer;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
