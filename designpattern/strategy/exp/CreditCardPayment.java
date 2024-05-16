package hus.oop.designpattern.strategy.exp;

public class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber;
    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    public void pay(int amount) {
        System.out.println("Paid " + amount +"using credit card number " + creditCardNumber);
    }
}
