package edu.smc.hello.database;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DatabaseTest {

	@Autowired 
	DBInterface dbInterface; //object of DBInterface
	
	@Test
	public void databaseTester() {
		String data = dbInterface.getData();
		System.out.println(data);
		
	}
}
