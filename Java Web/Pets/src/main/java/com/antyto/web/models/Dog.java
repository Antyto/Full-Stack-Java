package com.antyto.web.models;

public class Dog extends Animal implements Pet {
	
	public Dog () {}
	
	public Dog(String name, String breed, double weight) {
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}
	
	@Override
	public String showAffection() {
		if (this.getWeight() < 30) {
			return this.getName() + " salta y gira tu alrededor! Kawaii! ";
		}
		else {
			return this.getName() + " ha maullado pidiendo atencion... quiere que lo tomes en brazos!";
		}
	}

}
