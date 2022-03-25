package ex1;

import java.util.*;

public class FormeComposite extends Forme {

	public List<Forme> Composants= new ArrayList<Forme>();
	public FormeComposite(String clr) { 
		couleur=clr;
	}

	public double calculerSurface() {
			double SurfaceComposite = 0 ;
		for(Forme i : Composants) {
			SurfaceComposite= SurfaceComposite +i.calculerSurface();
		}
		return SurfaceComposite;
	}

	public String afficherCouleur() {
		String couleurComposite = couleur;
		for(Forme i : Composants) {
			couleurComposite= couleurComposite +" + "+ i.afficherCouleur();
		}
		return couleurComposite ;
	}

	public boolean ajouteForme(Forme f) {
		Composants.add(f);
		return true;
	}

	public boolean supprimerForme(Forme f) {
		Composants.remove(f);
		return true;
	}

}
