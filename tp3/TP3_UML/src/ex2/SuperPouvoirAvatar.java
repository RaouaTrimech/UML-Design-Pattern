package ex2;

public class SuperPouvoirAvatar {
	
	public String Nom;
	public String description ;
	public SuperPouvoirAvatar( String Nom , String description) {
		this.Nom = Nom;
		this.description = description ;
	}
	public void affiche (double prix_vente) {
		System.out.println("Le prix de vente du superpouvoir: "+ Nom + " de description: " + description +" est: "+ prix_vente);
	}
}
