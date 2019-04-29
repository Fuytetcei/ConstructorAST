package ast.terminales;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class BoolTrue extends E {
	  private String tipoBool;
	  public BoolTrue() {
	   this.tipoBool = "true";   
	  }
	  public String id() {return tipoBool;}
	  public TipoE tipo() {return TipoE.TRUE;}    
}
