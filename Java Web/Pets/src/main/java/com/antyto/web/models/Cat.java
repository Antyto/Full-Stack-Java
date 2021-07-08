package com.antyto.web.models;

	public class Cat extends Animal implements Pet{

		public Cat() {}
		
		public Cat(String name, String breed, double weight) {
			this.setName(name);
			this.setBreed(breed);
			this.setWeight(weight);
		}
		
		@Override
		public String showAffection() {
			return "Tu " + this.getBreed() + ", " + this.getName() + " , se encariño contigo.";
		}
	} 
	
	

