package com.epuepu.smoothieapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class OrderController {

    @GetMapping
    public String getSmoothies() {
        return "general";
    }

}