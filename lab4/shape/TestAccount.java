package hus.oop.lab4.shape;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(account1); // toString()

        Account account2 = new Account("A102", "Kumar"); // default balance
        System.out.println(account2);

        System.out.println("ID : " + account1.getID());
        System.out.println("Name : " + account1.getName());
        System.out.println("Balance : " + account1.getBalance());

        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);
        account1.debit(500); // debit() error
        System.out.println(account1);

        account1.transferTo(account2, 100); // toString()
        System.out.println(account1);
        System.out.println(account2);
    }
}
