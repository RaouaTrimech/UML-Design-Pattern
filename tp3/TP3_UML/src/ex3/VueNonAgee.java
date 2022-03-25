package ex3;

import java.util.List;

public class VueNonAgee implements StrategieVue {

	public VueNonAgee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void affiche(List<VueProduit> Contenu) {
		int i=0;
		for(VueProduit produit : Contenu ) {
			i++;
			produit.afficher();
			if(i==3) {
				System.out.println();
				i=0;
			}
		}
		
	}

}
