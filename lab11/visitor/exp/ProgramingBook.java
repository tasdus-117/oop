package hus.oop.lab11.visitor.exp;

public interface ProgramingBook extends Book {
    @Override
    void accept(Visitor v);
    String getResource();
}
