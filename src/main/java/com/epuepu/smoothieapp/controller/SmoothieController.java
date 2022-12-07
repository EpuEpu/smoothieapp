package com.epuepu.smoothieapp.controller;

import com.epuepu.smoothieapp.model.Smoothie;
import com.epuepu.smoothieapp.service.SmoothieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/smoothies")
public class SmoothieController {

    @Autowired
    SmoothieService smoothieService;

    @GetMapping
    public String showSmoothies(Model model) {
        List<Smoothie> smoothies = smoothieService.getSmothies();
        model.addAttribute("smoothies", smoothies);
        return "smoothies";
    }

    @GetMapping(value="/{smoothieid}")
    public String getSmoothieDetails(Model model, @PathVariable Long smoothieid) {
        Smoothie smoothie = smoothieService.getSmothieDetails(smoothieid);
        model.addAttribute("smoothie", smoothie);
        return "smoothieDetails";
    }

    @PutMapping(value="/{smoothieid}/edit")
    public String editSmoothieDetails(Model model, @PathVariable Long smoothieid,
                                                      @RequestBody Smoothie smoothie) {
        smoothieService.editSmothieDetails(smoothieid, smoothie);
        model.addAttribute("smoothies", smoothie);
        model.addAttribute("message", "success");
        return "smoothieDetails";
    }

    @DeleteMapping(value="/{smoothieid}")
    public String deleteSmoothie(Model model, @PathVariable Long smoothieid) {
        smoothieService.deleteSmoothie(smoothieid);
        model.addAttribute("message", "success");
        //redirect
        List<Smoothie> smoothies = smoothieService.getSmothies();
        model.addAttribute("smoothies", smoothies);
        return "smoothies";
    }

}
