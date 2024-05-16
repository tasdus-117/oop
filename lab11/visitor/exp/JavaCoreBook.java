package hus.oop.lab11.visitor.exp;

public class JavaCoreBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Resource 1";
    }
    public String getFavouriteBook() {
        return "FavouriteBook";
    }
}
