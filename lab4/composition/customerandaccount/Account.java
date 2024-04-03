package hus.oop.lab4.composition.customerandaccount;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    public Account() {

    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return customer.getName() + "(" + id + ") balance=$" + Math.round(balance*100.0)/100.0  + "0";
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public Account deposit(double amount) {
        balance += amount;
        return this;
    }
    public Account withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        }else
            System.out.println("amount withdraw exceeds the current balance!");
        return this;
    }
}
