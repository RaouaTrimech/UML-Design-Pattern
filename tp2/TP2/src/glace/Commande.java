package glace;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class Commande {
	//juste modifier CoupeGlacee en Produit
	  private List<Produit> lesProduits ;
	  
	public void publieFacture(PrintWriter writer) {
		float total = 0;
		for (Iterator it = this.lesProduits.iterator(); it.hasNext();) {
		Produit prod = (Produit) it.next();
		writer.println(prod.description()+" + "+prod.cout());
		total = total + prod.cout();
		}
		writer.println(" TOTAL : "+total);
		}


	public static void main(String[] args) {
		ChocolatBlancChocolatLait coupeCC = ChocolatBlancChocolatLait.SINGLETON;
		SauceChocolat choc = new SauceChocolat(coupeCC);
		Chantilly ch = new Chantilly(choc);
		System.out.println(ch.description());
		Café c = Café.SINGLETON;
		SauceChocolat cafc = new SauceChocolat(c);
		System.out.println("café "+cafc.description());
		
	}

}
