
public class BatTest {
	
	public static void main(String[] args) {

		Bat alucard = new Bat();
		

		alucard.fly();
		alucard.attackTown();
		alucard.eatHumans();
		System.out.print("\n");

		alucard.attackTown();
		System.out.print("\n");
		

		alucard.fly();
		alucard.attackTown();
		alucard.eatHumans();
		System.out.print("\n");
		
		System.out.print("Alucard tiene una energia de: ");
		alucard.displayEnergy();
	}
	
}
