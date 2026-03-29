package org.lab.springbootlab;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final List<PaymentService> paymentServices;

    // Constructor
    public OrderService(List<PaymentService> paymentServices) {

        this.paymentServices = paymentServices;

    }

    public double calculateTotal(Order order) {

        double burgerPrice = 3.00;
        double friesPrice = 1.50;
        double drinkPrice = 1.00;

        return (order.getBurgers() * burgerPrice)
                + (order.getFries() * friesPrice)
                + (order.getDrinks() * drinkPrice);

    }

    public void placeOrder(Order order) {

        double total = calculateTotal(order);

        for (PaymentService service : paymentServices) {

            if (service.getPaymentMethod().equalsIgnoreCase(order.getPaymentMethod())) {

                service.processPayment(total);
                return;

            }

        }

    }

}
