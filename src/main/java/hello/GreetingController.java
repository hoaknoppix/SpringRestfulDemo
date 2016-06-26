package main.java.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
 
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){
		return new Greeting(0, "Good moring" + name);
	}
	
}
