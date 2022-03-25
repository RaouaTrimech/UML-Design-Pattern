package glace;

/*public enum Parfum {
	CASSIS , CHOCOBLANC ,CHOCOLAIT , CHOCONOIR , FRAISE , FRAMBOISE ;
}*/

public class Parfum{
	 
		 public static Parfum CASSIS = new Parfum("Cassis") ;
		 public static Parfum CHOCOBLANC= new Parfum("ChocolatBlanc");
		 public static Parfum CHOCOLAIT= new Parfum("ChocolatLait") ;
		 public static Parfum CHOCONOIR = new Parfum("ChocolatNoir"); 
		 public static Parfum FRAISE= new Parfum("Fraise") ;
		public static Parfum FRAMBOISE = new Parfum("Framboise");
	
	 private String name ;
	private Parfum(String s) {
		this.name = s;
	}
	public String toString() {
		return name ;
	}
}