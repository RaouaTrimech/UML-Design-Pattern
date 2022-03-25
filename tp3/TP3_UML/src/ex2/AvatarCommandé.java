package ex2;

import java.util.*;

public class AvatarCommandé {
	List<SuperPouvoirAvatar> SuperPouvoirs = new ArrayList<SuperPouvoirAvatar>();
	List<Double> PrixDeVenteSuperPouvoirs = new ArrayList<Double>();
	FabriqueSuperpouvoir fb = new FabriqueSuperpouvoir() ;
	public AvatarCommandé() {
		
	}
	public void AjouterSuperPouvoir(String Nom , double prix_Vente) {
		SuperPouvoirAvatar Avatar =fb.getSuperPouvoir(Nom);
		SuperPouvoirs.add(Avatar);
		PrixDeVenteSuperPouvoirs.add(prix_Vente);
	}
	public void afficheSuperPouvoir(SuperPouvoirAvatar SuperPouvoir ) {
		int val =((List<SuperPouvoirAvatar>) SuperPouvoirs).indexOf(SuperPouvoir);
		SuperPouvoir.affiche(PrixDeVenteSuperPouvoirs.get(val));
	}
	
}
