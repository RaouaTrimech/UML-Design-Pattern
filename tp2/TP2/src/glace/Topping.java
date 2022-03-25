package glace;

public abstract class Topping extends Produit {
	protected Produit coupeGlace ;
	public String Description ; 
	public float surcout ;
	
	public Topping(Produit coupeGlace) {
		
		this.coupeGlace = coupeGlace;
	}
	
	public float cout()
	{
		return coupeGlace.cout();
	}
	
	public String description()
	{
		return coupeGlace.description();
	}
}
