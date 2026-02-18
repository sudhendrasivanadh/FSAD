package com.klu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {
	@GetMapping("/hello")
	public String sayHello(){
		return "This is Ganesh";
	}
	


}
