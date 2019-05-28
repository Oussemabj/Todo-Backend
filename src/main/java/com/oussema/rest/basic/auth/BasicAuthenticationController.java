package com.oussema.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	@GetMapping(path="/basicauth")
public AuthenticationBean helloWorldBean() {
	   return new AuthenticationBean  ("données jeyin mel Backend :D" );
//throw new RuntimeException(" vous étes authentifier ...  :D");
	}
	
}
