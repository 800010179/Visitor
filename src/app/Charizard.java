package app;

public class Charizard extends PokemonTila{
	private static Charizard instanssi;
	private PokemonVierailija vierailija;
	private String nimi;
	
	private Charizard() {
		vierailija = new PokemonTilaVierailija();
		nimi = "Charizard";
		System.out.println("Pokemonisi on nyt " + nimi + "!");
	}
	public String getNimi() {
		return nimi;
	}
	public static Charizard getInstance() {
		if(instanssi == null) {
			instanssi = new Charizard();
		}
		return instanssi;
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
