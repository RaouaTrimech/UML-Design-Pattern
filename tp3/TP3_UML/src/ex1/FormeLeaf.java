package ex1;

public class FormeLeaf extends Forme {

	public FormeLeaf(String clr) {
		couleur=clr;
	}

	@Override
	public double calculerSurface() {
		return surface;
	}

	@Override
	public String afficherCouleur() {
		return couleur;
	}

	@Override
	public boolean ajouteForme(Forme f) {
		return false;
	}

	@Override
	public boolean supprimerForme(Forme f) {
		return false;
	}

}
