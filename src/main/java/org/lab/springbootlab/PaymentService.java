package org.lab.springbootlab;

public interface PaymentService {
    void processPayment(double amount);
    String getPaymentMethod();
}
