package com.oussema.rest.webservices.Restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
public String helloWorld() {
	return "hello world" ;
} 
	@GetMapping(path="/hello-world-bean")
public HelloWorldBean helloWorldBean() {
	   return new HelloWorldBean  ("données jeyin mel Backend :D" );
//throw new RuntimeException(" Klet b3adh'ha Tsarref !!");
	}
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		  return new HelloWorldBean  (String.format("njeweb fik bel backend ba3d mat3adit el SpringSecurityConfiguration, %s",name) );
	}

}
