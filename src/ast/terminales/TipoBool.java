package ast.terminales;

import ast.expresiones.TipoE;

public class TipoBool {
	 private String tipo;
	  public TipoBool() {
		  this.tipo = "bool";   
	  }
	  public String id() {return tipo;}
	  public TipoE tipo() {return TipoE.TIPOBOOL;}  
}
