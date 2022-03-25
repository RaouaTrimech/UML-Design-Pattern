package glace;

public class SauceChocolat extends Topping {

	public SauceChocolat(Produit c) {
		super(c);
		this.Description="et sa delicieuse sauce chocolat";
		this.surcout=(float) 0.7;
	}
	@Override
	public float cout() {
		return super.cout()+surcout;
	}
	
	public String description() {
		return super.description()+ Description ;
	}
	

}
