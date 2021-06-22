public class GorillaTest {
		
	public static void main(String[] args) {

		Gorilla chita = new Gorilla();
		
		chita.throwSomething();
		chita.throwSomething();
		chita.throwSomething();
		
		chita.eatBanana();
		chita.eatBanana();
		
		chita.climb();
		
		System.out.print("El nivel de energia del gorila es: ");
		chita.displayEnergy();
	}

}