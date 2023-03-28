package app;

public final class Charmander extends PokemonTila{
	private static Charmander instanssi;
	private PokemonVierailija vierailija;
	private String nimi;
	
	private Charmander() {
		vierailija = new PokemonTilaVierailija();
		nimi = "Charmander";
		System.out.println("Pokemonisi on nyt " + nimi + "!");
	}
	public static Charmander getInstance() {
		if(instanssi == null) {
			instanssi = new Charmander();
		}
		return instanssi;
	}
	public String getNimi() {
		return nimi;
	}
	void hyppaa(Pokemon p) {
		System.out.println(nimi + " hyppäsi!");
		vierailija.vieraile(this, p);
	}
	void lyo(Pokemon p) {
		System.out.println(nimi + " löi!");
		vierailija.vieraile(this, p);
	}
	void syokseTulta(Pokemon p) {
		System.out.println(nimi + " Syöksi tulta!");
		vierailija.vieraile(this, p);
	}
	
}
