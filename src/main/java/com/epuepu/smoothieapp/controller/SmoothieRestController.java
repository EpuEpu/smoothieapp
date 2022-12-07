package com.epuepu.smoothieapp.controller;

import com.epuepu.smoothieapp.model.Smoothie;
import com.epuepu.smoothieapp.service.SmoothieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/smoothies")
public class SmoothieRestController {

    SmoothieService smoothieService;

    @Autowired
    public SmoothieRestController(SmoothieService smoothieService) {
        this.smoothieService = smoothieService;
    }

    @GetMapping
    public @ResponseBody List<Smoothie> getSmoothies() {
        return smoothieService.getSmothies();
    }

    @GetMapping(value="/{smoothieid}")
    public @ResponseBody Smoothie getSmoothieDetails(@PathVariable Long smoothieid) {
        return smoothieService.getSmothieDetails(smoothieid);
    }

    @PutMapping(value="/{smoothieid}/edit")
    public @ResponseBody Smoothie editSmoothieDetails(@PathVariable Long smoothieid, @RequestBody Smoothie smoothie) {
        return smoothieService.editSmothieDetails(smoothieid, smoothie);
    }

    @PostMapping
    public @ResponseBody Smoothie createSmoothie(@RequestBody Smoothie smoothie) {
        return smoothieService.createSmoothie(smoothie);
    }

    @DeleteMapping(value="/{smoothieid}")
    public void deleteSmoothie(@PathVariable Long smoothieid) {
        smoothieService.deleteSmoothie(smoothieid);
    }

}
