package org.lab.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final OrderService orderService;

    public HomeController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("/")    // Represents a request at the root of the site
    public String index() {

        return "index.html";

    }

    @PostMapping("/checkout")
    public String checkout(@ModelAttribute Order order, Model model) {

        double total = orderService.calculateTotal(order);
        orderService.placeOrder(order);

        model.addAttribute("total", total);
        model.addAttribute("method", order.getPaymentMethod());

        return "result";

    }

}
