package hus.oop.designpattern.strategy.exp;

public class ShoppingCart {
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void checkout(int amount) {
        strategy.pay(amount);
    }
}
