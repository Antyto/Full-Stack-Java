
public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("El gorila ha lanzado algo! ... Son bananas!");
		this.setEnergia(this.getEnergia() - 5);
	}
	
	public void eatBanana() {
		System.out.println("El gorila ha comido... Que satisfecho se siente");
		this.setEnergia(this.getEnergia() + 10);
	}
	
	public void climb() {
		System.out.println("El gorila ha trepado a la copa del arbol... Que alto esta!");
		this.setEnergia(this.getEnergia() - 10);
	}

}