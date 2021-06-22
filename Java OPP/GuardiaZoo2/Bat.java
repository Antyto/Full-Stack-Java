
public class Bat extends Mammal {

	public Bat() {
		this.setEnergia(300);
	}
	
	public void fly() {
		System.out.println("Alucard comienza a volar... El sonido producido por sus alas es ensordecedor");
		this.setEnergia(this.getEnergia() - 50);
	}
	
	public void eatHumans() {
		System.out.println("Alucard ha atacado un humano y se lo ha comido!!! ... Bueno.. no importa");
		this.setEnergia(this.getEnergia() + 25);
	}
	
	public void attackTown() {
		System.out.println("Alucard canaliza su rabia destruyendo todo a su paso... Las explosiones se escuchan por todos lados ... la caida de la ciudad es inminente");
		this.setEnergia(this.getEnergia() - 50);
	}
	
}
