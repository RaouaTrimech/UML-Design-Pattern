package glace;

import java.util.ArrayList;

public class FruitsRouges extends Produit {
public static final FruitsRouges SINGLETON = new FruitsRouges();
private FruitsRouges() {
this.parfums = new ArrayList<Parfum>();
this.parfums.add(Parfum.FRAISE);
this.parfums.add(Parfum.FRAMBOISE);
this.parfums.add(Parfum.CASSIS);
}
public float cout() {
return 6;
}
}
