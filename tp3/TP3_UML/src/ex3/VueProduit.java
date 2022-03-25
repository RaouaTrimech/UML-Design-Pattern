package ex3;

public class VueProduit {
	protected String description ;

	public VueProduit (String description)
	{
	   this.description=description;
	}

	public void afficher()
	{
	  System.out.print(description);
	}

}
