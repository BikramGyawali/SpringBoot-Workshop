package edu.smc.databasedemo.entity;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
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
	@Test
	public void getSingleRow() {
		System.out.println(studentRepository.findById(2));
	}
	
	@Test
	public void insert() {
		Student student = new Student("Tester",21,"BBA");
		studentRepository.save(student);
	}
	@Test
	public void delete() {
		studentRepository.deleteById(2);
		System.out.print("Delete");
	}
}
 
