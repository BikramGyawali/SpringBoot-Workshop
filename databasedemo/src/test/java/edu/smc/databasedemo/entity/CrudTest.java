package edu.smc.databasedemo.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CrudTest {

	
	@Autowired
	StudentRepository studentRepository;
	
	@Test
	public void getRows() {
		System.out.println(studentRepository.findAll());
	}
	
}
