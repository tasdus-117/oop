package hus.oop.lab11.visitor.exp;

public class BusinessBook implements Book {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    public String getPublisher() {
        return "Publisher";
    }
}
