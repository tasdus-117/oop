package hus.oop.lab11.visitor.using;

import org.w3c.dom.ls.LSOutput;

public class SquirrelMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("SquirrelMailClient: sendMail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("SquirrelMailClient: receiveMail");
    }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}
