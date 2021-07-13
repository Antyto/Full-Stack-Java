package com.antyto.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping(value="/{input}", method = RequestMethod.GET)
	public String hello4(@PathVariable("input") String input) {
		if(input.equals("dojo")) {
			return "¡El Dojo es increíble!";
		}
		else if(input.equals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		}
		else if(input.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}

		return "Ruta no valida";
	}

}