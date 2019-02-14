package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // have method execute when mapped to specific url *hello* 
public class HelloController {
	
	@RequestMapping("/hello") //defines the url for restcontroller - maps to get method by default
	public String sayHi() {
		return "Hi";
	}
	
	
	
	
}
