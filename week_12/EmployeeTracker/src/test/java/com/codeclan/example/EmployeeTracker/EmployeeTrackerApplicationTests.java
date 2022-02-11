package com.codeclan.example.EmployeeTracker;

import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee almas = new Employee("Almas", 33, 72710610, "almas.butt@ros.gov.uk");
		employeeRepository.save(almas);
	}

}
