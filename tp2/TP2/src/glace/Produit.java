package glace;
import java.util.*;
public abstract class Produit {
protected List<Parfum> parfums;
protected Produit() {}
public String description() {
StringBuffer sb = new StringBuffer("");
for(Iterator it = parfums.iterator();it.hasNext();) {
sb.append(it.next().toString());
sb.append(" ");
}
return sb.toString();
}
public abstract float cout();

}
