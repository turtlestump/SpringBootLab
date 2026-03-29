package org.lab.springbootlab;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {

        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);

    }

    @Override
    public String getPaymentMethod() {
        return "paypal";
    }

}
