public class Wizard extends Human {
	
	private static int counter;
	
	Integer health = 50;
	Integer intelligence = 8;
	
	public Wizard() {
		counter++;
	}
	
	public void heal(Human h) {
		h.health += intelligence;
	}
	
	public void fireball(Human h) {
		h.health -= intelligence * 3;
	}
	
	public static int howMany() {
		return counter;
	}
}