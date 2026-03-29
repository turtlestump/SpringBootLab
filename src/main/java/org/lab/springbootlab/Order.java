package org.lab.springbootlab;

public class Order {

    private int burgers;
    private int fries;
    private int drinks;
    private String paymentMethod;

    // Setters / Getters
    public int getBurgers() {
        return burgers;
    }

    public void setBurgers(int burgers) {
        this.burgers = burgers;
    }

    public int getFries() {
        return fries;
    }

    public void setFries(int fries) {
        this.fries = fries;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}