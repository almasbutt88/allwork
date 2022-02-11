package com.codeclan.example.PirateService.repositories;

import com.codeclan.example.PirateService.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository <Pirate, Long> {// type is Pirate and key is class type Long

}
