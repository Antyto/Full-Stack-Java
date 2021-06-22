
public class BatTest {
	
	public static void main(String[] args) {
		//Create a new bat:
		Bat alucard = new Bat();
		
		// Have have it attack three towns: 
		alucard.fly();
		alucard.attackTown();
		alucard.eatHumans();
		System.out.print("\n");


		//Eat two humans:
		alucard.attackTown();
		System.out.print("\n");
		
		//fly twice:
		alucard.fly();
		alucard.attackTown();
		alucard.eatHumans();
		System.out.print("\n");
		
		//Display the energy level:
		System.out.print("Alucard tiene una energia de: ");
		alucard.displayEnergy();
	}
	
}
