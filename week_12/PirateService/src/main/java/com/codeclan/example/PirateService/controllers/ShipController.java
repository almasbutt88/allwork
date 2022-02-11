package com.codeclan.example.PirateService.controllers;

import com.codeclan.example.PirateService.models.Pirate;
import com.codeclan.example.PirateService.models.Ship;
import com.codeclan.example.PirateService.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping(value = "/ships")
    public List<Ship> getAllShips(){
        return shipRepository.findAll();

    }
    @GetMapping(value = "/{id}")
    public Optional<Ship> getRaidsByShip(){0
        return shipRepository.getById().getId();

    }

    @PostMapping(value = "/pirates")
    public ResponseEntity<Pirate>(@RequestBody Pirate pirate){
        pirateRepository.save(pirate);
        return new ResponseEntity<>(pirate, HttpStatus.Created);
    }
}
