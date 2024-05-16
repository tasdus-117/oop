package hus.oop.lab11.visitor.exp;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Resource";
    }
    public String getBestSeller() {
        return "Best Seller";
    }
}
