package hus.oop.lab11.visitor.using;

public class ZimbraMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("ZimbraMailCLient : send mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("ZimbraMailCLient : receive mail");
    }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}
