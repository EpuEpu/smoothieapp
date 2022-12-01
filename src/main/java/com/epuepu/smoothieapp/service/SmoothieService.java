package com.epuepu.smoothieapp.service;

import com.epuepu.smoothieapp.dto.SmoothieDTO;
import com.epuepu.smoothieapp.model.Smoothie;
import com.epuepu.smoothieapp.repo.SmoothieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SmoothieService {

    SmoothieRepository smoothieRepository;

    @Autowired
    public SmoothieService(SmoothieRepository smoothieRepository) {
        this.smoothieRepository = smoothieRepository;
    }

//    public List<SmoothieDTO> getSmothies() {
//        return smoothieRepository.findAll();
//    }
//
//    public SmoothieDTO getSmothieDetails(Long smoothieId) {
//        return smoothieRepository.findById(smoothieId);
//    }
//
//    public SmoothieDTO editSmothieDetails(SmoothieDTO smoothieDAO) {
//        return new SmoothieDTO();
//    }

    public List<Smoothie> getSmothies() {
        return (List<Smoothie>) smoothieRepository.findAll();
    }

    public Smoothie getSmothieDetails(Long smoothieId) {
        return smoothieRepository.findById(smoothieId).get();
    }

    public Smoothie editSmothieDetails(Smoothie smoothie) {
        return smoothieRepository.save(smoothie);
    }

    public Smoothie createSmoothie(Smoothie smoothie) {
        return smoothieRepository.save(smoothie);
    }
}
