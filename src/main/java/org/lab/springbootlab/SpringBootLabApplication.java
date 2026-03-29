package org.lab.springbootlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLabApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootLabApplication.class, args);

//        Debug
//        var orderService = new OrderService();
//        orderService.setPaymentService(new PayPalPaymentService());
//        orderService.placeOrder();

	}

}
