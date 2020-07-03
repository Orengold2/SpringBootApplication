package io.orengold.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String printSomething() {
		return "Hi this is the check controller rest API test!";
		
	}
}
