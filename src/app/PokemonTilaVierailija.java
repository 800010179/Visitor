package app;

public class PokemonTilaVierailija implements PokemonVierailija{
	private int vierailut = 0;
	
	@Override
	public void vieraile(Charizard charizard, Pokemon p) {
		vierailut++;
		System.out.println(charizard.getNimi() + " tekemät temput: " + vierailut);
	}

	@Override
	public void vieraile(Charmander charmander, Pokemon p) {
		vierailut++;
		System.out.println(charmander.getNimi() + " tekemät temput: " + vierailut);
		if(vierailut == 3) {
			System.out.println(charmander.getNimi() + " kehittyy!");
			charmander.kehity(p, Charmeleon.getInstance());
		}
	}

	@Override
	public void vieraile(Charmeleon charmeleon, Pokemon p) {
		vierailut++;
		System.out.println(charmeleon.getNimi() + " tekemät temput: " + vierailut);
		if(vierailut == 3) {
			System.out.println(charmeleon.getNimi() + " kehittyy!");
			charmeleon.kehity(p, Charizard.getInstance());
		}
		
	}
	
}
