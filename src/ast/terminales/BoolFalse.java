package ast.terminales;

import ast.expresiones.E;
import ast.expresiones.TipoE;

public class BoolFalse extends E {
	  private String tipoBool;
	  public BoolFalse() {
	   this.tipoBool = "false";   
	  }
	  public String valor() {return tipoBool;}
	  public TipoE tipo() {return TipoE.FALSE;}  
}
