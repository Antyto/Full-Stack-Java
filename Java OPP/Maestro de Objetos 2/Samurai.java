
public class Samurai extends Human {
	
	private static int counter;
	Integer health = 200;
	
	public Samurai() {
		counter++;
	}
	
	
	public void deathBlow(Human h){
		h.health = 0;
		health -=100;
	}
	
	public void meditate(){
		health +=50;
	}
		
	public static int howMany() {
		return counter;
	}

}