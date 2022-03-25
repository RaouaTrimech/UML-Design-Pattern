
package glace;

import java.util.ArrayList;

public class Chocolatchaud extends Produit {
public static final Chocolatchaud SINGLETON = new Chocolatchaud();
private Chocolatchaud() {
this.parfums = new ArrayList<Parfum>();
this.parfums.add(Parfum.FRAISE);
this.parfums.add(Parfum.FRAMBOISE);
this.parfums.add(Parfum.CASSIS);
}
public float cout() {
return 6;
}
}
