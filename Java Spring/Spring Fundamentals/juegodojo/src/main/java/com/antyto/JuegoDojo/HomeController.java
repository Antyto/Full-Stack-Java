package com.antyto.JuegoDojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	ArrayList<ArrayList> updates = new ArrayList<ArrayList>();
	int gold = 0;
	Date dateTime = new java.util.Date();
	String time = String.format("(%s %te %<tB %<tY %<tI:%<tM %<tp)", "", dateTime);
	
	@RequestMapping("/Gold")
	public String index(HttpSession session) {
		session.setAttribute("gold", gold);
		return "index.jsp";
	}
	
	@RequestMapping(path="/process_money", method=RequestMethod.POST)
	public String money(@RequestParam(value="building") String building, HttpSession session) {
		

		
		switch(building) {
		case "farm":
			int numero = ThreadLocalRandom.current().nextInt(10, 21);
			gold += numero;
			String color = "green";
			String mensaje = "You earned " + numero + " from the farm!";
			ArrayList<String> data = new ArrayList<String>();
			data.add(color);
			data.add(mensaje);
			data.add(time);
			updates.add(data);
			break;
		case "cave":
			numero= ThreadLocalRandom.current().nextInt(5, 11);
			gold += numero;
			color = "green";
			mensaje = "You earned " + numero + " from the cave!";
			data = new ArrayList<String>();
			data.add(color);
			data.add(mensaje);
			data.add(time);
			updates.add(data);
			break;
		case "house":
			numero = ThreadLocalRandom.current().nextInt(2, 6);
			gold += numero;
			color = "green";
			mensaje = "You stole " + numero + " from the house, you thief!";
			data = new ArrayList<String>();
			data.add(color);
			data.add(mensaje);
			data.add(time);
			updates.add(data);
			break;
		case "casino":
			numero = ThreadLocalRandom.current().nextInt(-50, 51);
			gold += numero;
			if (numero < 0) {
				color = "red";
				mensaje = "You lost " + numero + " at the casino. Ouch...";
			}
			else if (numero == 0){
				color = "black";
				mensaje = "You get nothing!";
			}
			else {
				color = "green";
				mensaje = "You won " + numero + " at the casino!";
			}
			data = new ArrayList<String>();
			data.add(color);
			data.add(mensaje);
			data.add(time);
			updates.add(data);
			break;
		}
		
		session.setAttribute("updates", updates);
		session.setAttribute("size", updates.size() - 1);
		return "redirect:/Gold";
	}
}