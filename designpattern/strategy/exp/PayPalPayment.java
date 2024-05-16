package hus.oop.designpattern.strategy.exp;

public class PayPalPayment implements PaymentStrategy {
    private String email;
    public PayPalPayment(String email) {
        this.email = email;
    }
    public void pay(int amount) {
        System.out.println("Paid " + amount + "using Paypal account " + email);
    }
}
