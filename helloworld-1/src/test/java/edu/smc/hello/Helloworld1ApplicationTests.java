package edu.smc.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.smc.hello.database.Mongo;
import edu.smc.hello.database.Mysql;

@SpringBootTest
class Helloworld1ApplicationTests {
 
	@Autowired
	Mysql database;  // we directly create object 
	
	@Autowired
	Mongo mongo;
	@Test
	void contextLoads() {
//		Mysql database = new Mysql();
		// changing the mysql to mongo
		String data = mongo.fetchData(false); 
		
//		String data = database.getData();
		System.out.println(data);
	}

}
