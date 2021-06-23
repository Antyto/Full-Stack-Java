
public class Ninja extends Human {
	
	private static int counter;
	
	Integer stealth = 10;
	
	public void steal(Human h) {
		h.health -= stealth;
		health += stealth;
	}
	
	public void runAway() {
		health -= 10;
	}
	
	public static int howMany() {
		return counter;
	}
}