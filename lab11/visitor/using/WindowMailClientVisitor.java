package hus.oop.lab11.visitor.using;

public class WindowMailClientVisitor implements MailClientVisitor {
    public void visit(OperaMailClient mailClient) {
        System.out.println("Configuration of Opera mail client for Window complete");
    }
    public void visit(SquirrelMailClient mailClient) {
        System.out.println("Configuration of Squirrel mail client for Window complete");
    }

    @Override
    public void visit(ZimbraMailClient mailClient) {
        System.out.println("Configuration of Zimbra mail client for Window complete");
    }
}
