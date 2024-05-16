package hus.oop.lab11.visitor.exp;

public class VisitorPatternExample {
    private VisitorImpl visitor;
    private BusinessBook businessBook;
    private DesignPatternBook designPatternBook;
    private JavaCoreBook javaCoreBook;
    public static void main(String[] args) {
        VisitorPatternExample visitorPatternExample = new VisitorPatternExample();
        visitorPatternExample.setup();
        visitorPatternExample.testBusinessBook();
        visitorPatternExample.testDesignPatternBook();
        visitorPatternExample.testJavaCoreBook();
    }
    public void setup() {
        visitor = new VisitorImpl();
        businessBook = new BusinessBook();
        designPatternBook = new DesignPatternBook();
        javaCoreBook = new JavaCoreBook();
    }
    public void testBusinessBook() {
        businessBook.accept(visitor);
        businessBook.getPublisher();
    }
    public void testDesignPatternBook() {
        designPatternBook.accept(visitor);
        System.out.println(designPatternBook.getBestSeller());
        System.out.println(designPatternBook.getResource());
    }
    public void testJavaCoreBook() {
        javaCoreBook.accept(visitor);
        System.out.println(javaCoreBook.getFavouriteBook());
        System.out.println(javaCoreBook.getResource());
    }
}
