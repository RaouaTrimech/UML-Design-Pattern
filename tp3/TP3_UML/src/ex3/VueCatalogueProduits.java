package ex3;

import java.util.ArrayList;
import java.util.List;

public class VueCatalogueProduits {
	
	public List<VueProduit> ListeProduits = new ArrayList<VueProduit>();
	public StrategieVue Strategie ;
	public VueCatalogueProduits() {
		
	}
	public void affiche() {
		Strategie.affiche(ListeProduits);
	}

}
