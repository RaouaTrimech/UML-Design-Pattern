package glace;

import java.util.ArrayList;

public class Caf� extends Produit {
public static final Caf� SINGLETON = new Caf�();
private Caf�() {
this.parfums = new ArrayList<Parfum>();
/*this.parfums.add(Parfum.FRAISE);
this.parfums.add(Parfum.FRAMBOISE);
this.parfums.add(Parfum.CASSIS);*/
}
public float cout() {
return 6;
}
}
