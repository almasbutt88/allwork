package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

    List<Pirate> findPiratesByFirstName(String firstName);
    //Get from Pirates where lastname = ?
    //select* from pirates where last_name = ?
    //Select * FROM PIRATES WHERE AGE > ?
    List<Pirate> findPiratesByLastName(String lastName);
}
