package ex3;

public class main {

	public static void main(String[] args) {
		VueProduit P1 = new VueProduit("Produit1");
		VueProduit P2 = new VueProduit("Produit2");
		VueProduit P3 = new VueProduit("Produit3");
		VueCatalogueProduits Catalogue = new VueCatalogueProduits();
		Catalogue.ListeProduits.add(P1);
		Catalogue.ListeProduits.add(P2);
		Catalogue.ListeProduits.add(P3);
		
		VueAgee VA = new VueAgee();
		VueNonAgee VNA = new VueNonAgee();
		
		Catalogue.Strategie = VA;
		Catalogue.affiche();
		
		Catalogue.Strategie = VNA;
		Catalogue.affiche();
		
	}

}
