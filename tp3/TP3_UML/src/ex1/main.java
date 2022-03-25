package ex1;

public class main {

	public static void  main(String[] args) {
		Forme FormeE = new FormeLeaf("Blue");
		Forme FormeD = new FormeLeaf("Red");
		Forme FormeB = new FormeLeaf("Orange");
		
		Forme FormeC = new FormeComposite("Green");
		FormeC.ajouteForme(FormeE);
		FormeC.ajouteForme(FormeD);
		
		Forme FormeA = new FormeComposite("Pink");
		FormeA.ajouteForme(FormeB);
		FormeA.ajouteForme(FormeC);
		
		System.out.println("FormeA : " +FormeA.afficherCouleur());
		System.out.println("FormeC : " +FormeC.afficherCouleur());
		System.out.println("FormeA : " +FormeA.calculerSurface());
		System.out.println("FormeC : " +FormeC.calculerSurface());
	}

}
