package com.example.lesson3.controller;

import com.example.lesson3.model.Trainer;
import com.example.lesson3.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demo", method = RequestMethod.GET)
public class TrainerController {
    @Autowired
    TrainerRepository trainerRepository;

    @GetMapping("/trainer")
    public List<Trainer> getAllTrainer() {
        return trainerRepository.findAll();
    }
}
