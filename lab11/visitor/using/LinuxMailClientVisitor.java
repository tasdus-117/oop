package hus.oop.lab11.visitor.using;

public class LinuxMailClientVisitor implements MailClientVisitor {
    public void visit(OperaMailClient mailClient) {
        System.out.println("Configuration of Opera mail client for Linux complete");
    }

    @Override
    public void visit(SquirrelMailClient mailClient) {
        System.out.println("Configuration of Squirrel mail client for Linux complete");
    }

    @Override
    public void visit(ZimbraMailClient mailClient) {
        System.out.println("Configuration of Zimbra mail client for Linux complete");
    }
}
