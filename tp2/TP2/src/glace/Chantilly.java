package glace;

public class Chantilly extends  Topping {

	Chantilly(Produit c ){
		super(c);
		this.Description="chantilly";
		this.surcout=(float) 0.5;
	}
	@Override
	public float cout() {
		return super.cout()+surcout;
	}
	public String description() {
		return super.description()+" "+ Description ;
	}

}
