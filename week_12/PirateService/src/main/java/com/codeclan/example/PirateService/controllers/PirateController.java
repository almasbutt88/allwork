package com.codeclan.example.PirateService.controllers;


import com.codeclan.example.PirateService.models.Pirate;
import com.codeclan.example.PirateService.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PirateController {
    @Autowired
    PirateRepository pirateRepository; //this is the same as creating a constructor, autowired is doing it in the background

    @GetMapping(value = "/pirates")//route
    public List<Pirate> getAllPirates(){ //not an arraylist. this is a spring feature
    return pirateRepository.findAll(); //returns a list of pirates in the repository
    }

    @GetMapping(value ="/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id){ //optional: java saying to http formatter that ...its null and will fail, useful for rest controller, to conform to http standards?
        return pirateRepository.findById(id);
    }


//    @GetMapping(value = "pirates/{firstname}")
//    public Optional<Pirate> getPirateByName(@PathVariable String firstName){
//        return null;
//    }
}
