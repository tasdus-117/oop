package hus.oop.lab11.visitor.exp;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook book) {
        System.out.println("Business Book Visitor");
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("Design Pattern Book Visitor");
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("Java Core Book Visitor");
    }
}
