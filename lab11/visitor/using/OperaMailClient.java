package hus.oop.lab11.visitor.using;

public class OperaMailClient implements MailClient {
    public void sendMail(String[] mailInfo) {
        System.out.println("OperaMailClient : Sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("OperaMailClient : Receiving mail");
    }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}
