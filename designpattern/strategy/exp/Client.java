package hus.oop.designpattern.strategy.exp;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("1234"));
        cart.checkout(100);
        cart.setPaymentStrategy(new PayPalPayment("hoangtu117@gmail.com"));
        cart.checkout(200);
    }
}
