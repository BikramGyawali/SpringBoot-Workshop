package edu.smc.hello.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/hello")
 public String testApi() {
	 return "seeing the use of dependencies";
 }
}
