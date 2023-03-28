package app;

public class Pokemon {
	private PokemonTila pokemonTila;
	
	public Pokemon() {
		pokemonTila = Charmander.getInstance();
	}
	
	public void hyppaa() {
		pokemonTila.hyppaa(this);
	}
	public void lyo() {
		pokemonTila.lyo(this);
	}
	public void syokseTulta() {
		pokemonTila.syokseTulta(this);
	}
	
	protected void kehity(PokemonTila pt) {
		pokemonTila = pt;
	}
}
