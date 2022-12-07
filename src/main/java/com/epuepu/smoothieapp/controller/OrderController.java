package com.epuepu.smoothieapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/orders")
public class OrderController {

    @PostMapping
    public String orderSmoothies() {
        return "general";
    }

    @GetMapping
    public String showOrdersOfUser() {
        return "general";
    }

}
