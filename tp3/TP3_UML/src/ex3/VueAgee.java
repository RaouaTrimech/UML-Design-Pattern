package ex3;

import java.util.List;

public class VueAgee implements StrategieVue {

	public VueAgee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void affiche(List<VueProduit> Contenu) {
		
		for(VueProduit produit : Contenu ) {
			produit.afficher();
			System.out.println();
			
		}
	}

}
