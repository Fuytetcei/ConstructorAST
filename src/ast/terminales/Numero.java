package ast.terminales;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class Numero extends E {
	  private String v;
	  public Numero(String v) {
	   this.v = v;   
	  }
	  public String val() {return v;}
	  public TipoE tipo() {return TipoE.NUMERO;}
}
