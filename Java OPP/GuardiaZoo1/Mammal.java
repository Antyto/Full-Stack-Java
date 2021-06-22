
public class Mammal {

	private int energia = 100;
	
	public Mammal() {}
		
		public int displayEnergy() {
			System.out.println(this.energia);
			return energia;
		
	}
		
		public int getEnergia() {
			return energia;
		}
		
		public void setEnergia(int nivel) {
			this.energia = nivel;
		}
}
