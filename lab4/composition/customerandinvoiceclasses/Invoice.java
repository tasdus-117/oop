package hus.oop.lab4.composition.customerandinvoiceclasses;

import java.security.PublicKey;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    public Invoice() {

    }

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        amount = amount - amount*customer.getDiscount()/100.0;
        return amount;
    }
    public String toString() {
        return "Invoice[" + id + ",customer=" + customer.toString() + ",amount=" + amount;
    }
}
