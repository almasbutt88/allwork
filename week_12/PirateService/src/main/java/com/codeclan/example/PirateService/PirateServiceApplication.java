package com.codeclan.example.PirateService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //inject string compilers in the background
public class PirateServiceApplication {

	public static void main(String[] args) { //main method
		SpringApplication.run(PirateServiceApplication.class, args);
	}// run the file and all dependencies will start up and show in the terminal. main one
	//is PirateServiceApplication then go to port 8080 which is localhost:8080 to start the server

}
