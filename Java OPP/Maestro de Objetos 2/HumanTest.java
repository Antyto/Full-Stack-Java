
public class HumanTest {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human();
		Ninja n = new Ninja();
		Wizard w = new Wizard();
		Samurai s = new Samurai ();

		w.heal(h1);
		System.out.println("El humano n°1 se ha curado! Ahora, su salud es de " + h1.health + ". Increible");
		w.fireball(h1);
		System.out.println("El hechicero, ha atacado. El humano n°1 ha perdido vida, quedando con " + h1.health);
		
		n.steal(h2);
		System.out.println("En ninja ha robado salud al humano n°2. La nueva estadistica de salud del ninja es " + n.health);
		n.runAway();
		System.out.println("En ninja ha huido. Su salud ha sido afectada, quedando en una puntuacion de " + n.health);
		
		s.deathBlow(h3);
		System.out.println("El samurai ha atacado fuertemente al humano n°3, reduciendo a " + h3.health + " sus puntos de vida, matandolo. "
				+ "Ademas, la salud del samurai se ha visto afectada por la muerte del humano n°3, quedando en una puntacion de " + s.health);
		s.meditate();
		System.out.println("El samurai esta meditando, lo que recupera su salud en un 50%, quedando su salud en " + s.health);
		
		s.howMany();
		
		
	}
}
