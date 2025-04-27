package edu.smc.hello.database;

import org.springframework.stereotype.Component;

@Component
public class Mongo {
 public String fetchData(boolean lazyloading) {
	 return "this is your  mongo data";
 }
}
