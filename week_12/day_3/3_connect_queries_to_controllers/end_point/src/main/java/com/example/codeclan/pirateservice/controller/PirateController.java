package com.example.codeclan.pirateservice.controller;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repository.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;


    @GetMapping(value = "/pirates")
    public ResponseEntity<List<Pirate>> getAllPirates(){
        return new ResponseEntity<>(pirateRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/pirates/{id}")
    public ResponseEntity getPirate(@PathVariable Long id){
        return new ResponseEntity<>(pirateRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/pirates")
    public ResponseEntity<Pirate> postPirate(@RequestBody Pirate pirate){
        pirateRepository.save(pirate);
        return new ResponseEntity<>(pirate, HttpStatus.CREATED);
    }


    @GetMapping(value = "/pirates/byraid")
    public ResponseEntity<List<Pirate>> getPiratesByRaidsId(@RequestParam(name = "raidid") Long id){
        return new ResponseEntity<>(pirateRepository.findByRaidsId(id),HttpStatus.OK);
    }
    //Write a controller that connects into the "find raid by location" query we completed in the last lesson

    @GetMapping(value = "/pirates/findbyraidlocation")
    public ResponseEntity<List<Pirate>> getPiratesByRaidLocation(@RequestParam())

}
