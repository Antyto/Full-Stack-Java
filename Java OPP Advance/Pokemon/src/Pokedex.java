
public class Pokedex extends AbstractPokemon {
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println("Nombre: "+pokemon.getName()+" Salud: "+pokemon.getHealth()+" Tipo: "+pokemon.getType());
	}
}