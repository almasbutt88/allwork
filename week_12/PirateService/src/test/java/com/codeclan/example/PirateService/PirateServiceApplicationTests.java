package com.codeclan.example.PirateService;

import com.codeclan.example.PirateService.models.Pirate;
import com.codeclan.example.PirateService.models.Raid;
import com.codeclan.example.PirateService.models.Ship;
import com.codeclan.example.PirateService.repositories.PirateRepository;
import com.codeclan.example.PirateService.repositories.RaidRepository;
import com.codeclan.example.PirateService.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//@AutoConfigureTestDatabase

@RunWith(SpringRunner.class)
@SpringBootTest
class PirateServiceApplicationTests {
	@Autowired
	PirateRepository pirateRepository;// creates and injects pirate repository

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		Ship ship = new Ship("Ghost Ship");
		shipRepository.save(ship);

		Pirate jack = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(jack);


	}

	@Test
	public void createRaid(){
		Raid raid = new Raid("Edinburgh", 4000);
		raidRepository.save(raid);
	}

}
