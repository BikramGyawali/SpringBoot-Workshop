package edu.smc.hello.database;

import org.springframework.stereotype.Component;

@Component   // final option is component for the dependencies 
public class Mysql {
	public String getData() {
		return "Here is the data";
	}
}
