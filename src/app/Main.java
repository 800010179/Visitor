package app;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemoni = new Pokemon();
		
		for(int i = 0; i < 3; i++) {
			pokemoni.hyppaa();
			pokemoni.lyo();
			pokemoni.syokseTulta();
		}

	}

}
