package com.antyto.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	@RequestMapping(value="/coding", method = RequestMethod.GET)
	public String hello() {
		return "¡Hola Coding Dojo!";
	}
		
	@RequestMapping(value="/coding/python", method = RequestMethod.GET)
	public String hello2() {
		return "¡Python/Django fue increíble!";
	}
		
	@RequestMapping(value="/coding/java", method = RequestMethod.GET)
	public String hello3() {
		return "¡Java/Spring es mejor!";
	}

}
