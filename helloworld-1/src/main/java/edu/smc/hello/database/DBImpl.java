package edu.smc.hello.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component


public class DBImpl implements DBInterface {
	
	@Autowired
//	Mysql database;
	Mongo mongo;
  public String selectData() {
//	  return "Here is the interface";
		return mongo.fetchData(false);
  }
}
