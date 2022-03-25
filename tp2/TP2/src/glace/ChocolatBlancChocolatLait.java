package glace;

import java.util.ArrayList;

public class ChocolatBlancChocolatLait extends Produit {
public static final ChocolatBlancChocolatLait SINGLETON = new ChocolatBlancChocolatLait();
private ChocolatBlancChocolatLait() {
	this.parfums = new ArrayList<Parfum>();
	this.parfums.add(Parfum.CHOCOBLANC);
	this.parfums.add(Parfum.CHOCOLAIT);
	this.parfums.add(Parfum.CHOCONOIR);
	}
public float cout() {
	return 6;
}
}
