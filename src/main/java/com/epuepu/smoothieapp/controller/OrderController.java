package com.epuepu.smoothieapp.controller;

import com.epuepu.smoothieapp.model.Order;
import com.epuepu.smoothieapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/orders")
public class OrderController {

    OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public String orderSmoothies() {
        return "general";
    }

    @GetMapping
    public String showOrdersOfUser(Model model) {
        List<Order> orders = orderService.getOrdersOfTheUser();
        model.addAttribute("orders", orders);
        return "orders";
    }

}
