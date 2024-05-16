package hus.oop.lab11.visitor.using;

import java.sql.SQLOutput;

public class MailClientVisitorTest {
    private MacMailClientVisitor macVisitor;
    private LinuxMailClientVisitor linuxVisitor;
    private WindowMailClientVisitor windowVisitor;
    private OperaMailClient operaMailClient;
    private SquirrelMailClient squirrelMailClient;
    private ZimbraMailClient zimbraMailClient;
    public static void main(String[] args) {
        MailClientVisitorTest test = new MailClientVisitorTest();
        test.setup();
        test.testOperaMailClient();
        test.testSquirrelMailClient();
        test.testZimbraMailClient();
    }
    public void setup() {
        macVisitor = new MacMailClientVisitor();
        linuxVisitor = new LinuxMailClientVisitor();
        windowVisitor = new WindowMailClientVisitor();
        operaMailClient = new OperaMailClient();
        squirrelMailClient = new SquirrelMailClient();
        zimbraMailClient = new ZimbraMailClient();
    }
    public void testOperaMailClient() {
        System.out.println("--Testing Opera Mail Client for different environments--");
        operaMailClient.accept(macVisitor);
        operaMailClient.accept(linuxVisitor);
        operaMailClient.accept(windowVisitor);
    }
    public void testSquirrelMailClient() {
        System.out.println("--Testing Squirrel Mail Client for different environments--");
        squirrelMailClient.accept(macVisitor);
        squirrelMailClient.accept(linuxVisitor);
        squirrelMailClient.accept(windowVisitor);
    }
    public void testZimbraMailClient() {
        System.out.println("--Testing Zimbra Mail Client for different environments--");
        zimbraMailClient.accept(macVisitor);
        zimbraMailClient.accept(linuxVisitor);
        zimbraMailClient.accept(windowVisitor);
    }
}
