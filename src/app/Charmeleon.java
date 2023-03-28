package app;

public class Charmeleon extends PokemonTila{
	private static Charmeleon instanssi;
	private PokemonVierailija vierailija;
	private String nimi;
	
	private Charmeleon() {
		vierailija = new PokemonTilaVierailija();
		nimi = "Charmeleon";
		System.out.println("Pokemonisi on nyt " + nimi + "!");
	}
	
	public static Charmeleon getInstance() {
		if(instanssi == null) {
			instanssi = new Charmeleon();
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
