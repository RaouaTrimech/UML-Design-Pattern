package ex2;

import java.util.ArrayList;
import java.util.List;

public class FabriqueSuperpouvoir {
		List<SuperPouvoirAvatar> SuperPouvoirs = new ArrayList<SuperPouvoirAvatar>();
	public FabriqueSuperpouvoir() {
	}
	
	public SuperPouvoirAvatar getSuperPouvoir(String Nom) {
		for (SuperPouvoirAvatar SP : SuperPouvoirs) {
			if (SP.Nom == Nom) {
				return SP;
			}
		}
		SuperPouvoirAvatar SP = new SuperPouvoirAvatar (Nom ,"");
		SuperPouvoirs.add(SP);
		return SP ;
	}
	
	

}
