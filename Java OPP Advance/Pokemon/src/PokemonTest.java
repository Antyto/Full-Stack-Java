
public class PokemonTest extends Pokedex {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon dialga = pokedex.createPokemon("Dialga", "Acero/Dragon", 483);
		Pokemon cobalion = pokedex.createPokemon("Cobalion", "Acero/Lucha", 638);
		Pokemon articuno = pokedex.createPokemon("Articuno", "Hielo7Volador", 144);
		Pokemon entei = pokedex.createPokemon("Entei", "Fuego", 244);
		Pokemon meloetta = pokedex.createPokemon("Meloetta", "Normal/Psiquico", 648);
		
		pokedex.attackPokemon(dialga);
		pokedex.pokemonInfo(dialga);
		pokedex.pokemonInfo(cobalion);
		pokedex.attackPokemon(entei);
		pokedex.attackPokemon(meloetta);
		pokedex.pokemonInfo(entei);
		pokedex.pokemonInfo(articuno);
	}

}