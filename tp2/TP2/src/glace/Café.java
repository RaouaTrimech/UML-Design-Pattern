package glace;

import java.util.ArrayList;

public class Café extends Produit {
public static final Café SINGLETON = new Café();
private Café() {
this.parfums = new ArrayList<Parfum>();
/*this.parfums.add(Parfum.FRAISE);
this.parfums.add(Parfum.FRAMBOISE);
this.parfums.add(Parfum.CASSIS);*/
}
public float cout() {
return 6;
}
}
