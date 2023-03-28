package app;

public abstract class PokemonTila {
	void hyppaa(Pokemon p) {}
	void lyo(Pokemon p) {}
	void syokseTulta(Pokemon p) {}
	void kehity(Pokemon p, PokemonTila pt) {
		p.kehity(pt);
	}
}
